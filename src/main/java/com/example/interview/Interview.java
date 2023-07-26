package com.example.interview;

import java.util.List;

public class Interview {

    public static void main(String args[]){
        String input = "Topic: ACC_NG_WORKORDER_EVENTS_QA\tPartition: 2\tLeader: 2069362882\tReplicas: 2069362882,2014847412,1559390835\tIsr: 2069362882,2014847412\n" +
                "        Topic: ACC_NG_WORKORDER_EVENTS_STG\tPartition: 0\tLeader: 1686848455\tReplicas: 1686848455,1559390835,861769660\tIsr: 1686848455,861769660\n" +
                "        Topic: ACC_NG_WORKORDER_EVENTS_STG\tPartition: 1\tLeader: 1545660941\tReplicas: 1545660941,861769660,220828011\tIsr: 1545660941,861769660\n" +
                "        Topic: ACC_NG_WORKORDER_EVENTS_STG\tPartition: 2\tLeader: 637498453\tReplicas: 2069362882,220828011,637498453\tIsr: 637498453\n" +
                "        Topic: ACC_WORKORDER_ANALYTICS_DEV\tPartition: 0\tLeader: 1593506246\tReplicas: 1593506246,2069362882,1559390835\tIsr: 1593506246,2069362882\n" +
                "        Topic: ACC_WORKORDER_ANALYTICS_DEV\tPartition: 2\tLeader: 1881620059\tReplicas: 1881620059,1559390835,220828011\tIsr: 1881620059\n" +
                "        Topic: ACC_WORKORDER_ANALYTICS_QA\tPartition: 0\tLeader: 1746655509\tReplicas: 637498453,1686848455,1746655509\tIsr: 1746655509,1686848455";

        for (String line: input.split("\n")){

        }
    }
}
class Partition{
    private Integer partitionID;
    private Long leader;
    private List<Long> replicas;
    private List<Long> inSyncReplicas;
}
class QueueRecord{
    private String topic;
    private List<Partition> partitions;
}

