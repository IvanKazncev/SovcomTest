package Task2.Models;

import Task2.Models.ModelGender;
import Task2.Models.ModelInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultModel {

    private ArrayList<ModelGender> results;

    private ModelInfo info;
}
