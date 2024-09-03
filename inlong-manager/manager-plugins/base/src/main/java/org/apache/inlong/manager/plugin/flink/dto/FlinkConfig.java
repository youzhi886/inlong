/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.inlong.manager.plugin.flink.dto;

import lombok.Data;

/**
 * Flink config, including address, port, job manager port, etc.
 */
@Data
public class FlinkConfig {

    private String address;

    private Integer port;

    private Integer jobManagerPort;

    private String savepointDirectory;

    private Integer parallelism;

    private boolean drain;

    // flink version
    private String version;

    // max msg rate per core
    private Integer maxMsgRatePerCore;

    // whether to enable dynamic parallelism
    private Boolean dynamicParallelismEnable;
}
