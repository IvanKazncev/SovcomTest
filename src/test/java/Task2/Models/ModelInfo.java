package Task2.Models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ModelInfo {

    private String seed;

    private Integer results;

    private Integer page;

    private String version;
}
