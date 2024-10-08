package registration.uz.hgpuserregistration.DetectorData;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Builder
public class DetectorDataDTO {
    private String detectorId;
    private double gasPressure;
    private int battery;
    private double temperature;
    private double airHumidity;
    private double price;
}
