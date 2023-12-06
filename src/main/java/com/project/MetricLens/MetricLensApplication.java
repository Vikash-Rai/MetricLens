package com.project.MetricLens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MetricLensApplication {
    /**
     * An springboot application [MetricLens]
     * for measuring developer efficiency through gitlab,jenkins,jira
     * using grafana as visualization tool and influxdb or mongodb or mysql as datasource.
     * Author: Vikash Rai
     * vikashrai2507@gmail.com
     * vikashrai.in@gmail.com
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(MetricLensApplication.class, args);
    }

}
