/*
 * Copyright 2012-2018 Chronicle Map Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.openhft.chronicle.map;

public class Issue62ChronicleClient {

    public static void main(String[] args) throws Exception {
        /*prepare(MAP_FILE_B);

        ChronicleMapBuilder<String, Long> cityPostalCodesMapBuilder =
                ChronicleMapBuilder.of(String.class, Long.class)
                        //.averageKeySize(100)
                        .averageKey(Issue62ChronicleServer.STR)
                        .entries(50_000);

        ((ChronicleHashBuilderPrivateAPI<?, ?>) cityPostalCodesMapBuilder.privateAPI())
                .replication((byte) 2);

        try (ChronicleMap<String, Long> map =
                     cityPostalCodesMapBuilder.createPersistedTo(MAP_FILE_B)) {

            System.out.println( "Starting");
            Jvm.pause(3000);

            for (Entry<String, Long> entry : map.entrySet()) {
                System.out.println(entry);
            }
        }*/
    }
}
