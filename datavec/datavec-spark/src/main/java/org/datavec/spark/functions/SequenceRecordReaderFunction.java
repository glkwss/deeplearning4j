/*-
 *  * Copyright 2016 Skymind, Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 */

package org.datavec.spark.functions;

import org.apache.spark.api.java.function.Function;
import org.apache.spark.input.PortableDataStream;
import org.datavec.api.records.reader.SequenceRecordReader;
import org.datavec.api.writable.Writable;
import scala.Tuple2;

import java.io.DataInputStream;
import java.net.URI;
import java.util.List;

/**RecordReaderFunction: Given a SequenceRecordReader and a file (via Spark PortableDataStream), load and parse the
 * sequence data into a {@code List<List<Writable>>}
 * @author Alex Black
 */
public class SequenceRecordReaderFunction
                implements Function<Tuple2<String, PortableDataStream>, List<List<Writable>>> {
    protected SequenceRecordReader sequenceRecordReader;

    public SequenceRecordReaderFunction(SequenceRecordReader sequenceRecordReader) {
        this.sequenceRecordReader = sequenceRecordReader;
    }

    @Override
    public List<List<Writable>> call(Tuple2<String, PortableDataStream> value) throws Exception {
        URI uri = new URI(value._1());
        PortableDataStream ds = value._2();
        try (DataInputStream dis = ds.open()) {
            return sequenceRecordReader.sequenceRecord(uri, dis);
        }
    }
}
