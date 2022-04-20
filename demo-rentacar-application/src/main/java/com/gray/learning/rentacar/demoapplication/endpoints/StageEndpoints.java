package com.gray.learning.rentacar.demoapplication.endpoints;

import javafx.stage.Stage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 15-Apr-22
 * Time: 3:35 PM
 * demo-rentacar-application
 */
@Component
@Endpoint(id = "stage")
public class StageEndpoints {

    Map<String, Stage> stages = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String, Stage> getAllStages() {
        return stages;
    }

    //localhost:8080/actuator/{name}
    @ReadOperation
    public Stage getStage(@Selector String name) {
        return stages.get("name");
    }

    @WriteOperation
    public void setValue(@Selector String name,Stage stage) {
        stages.put(name,stage);
    }

    @Setter
    @Getter
    @AllArgsConstructor
    static class stage {
        int value;
    }

}
