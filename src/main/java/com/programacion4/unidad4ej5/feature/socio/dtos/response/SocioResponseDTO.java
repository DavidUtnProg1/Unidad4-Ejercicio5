package com.programacion4.unidad4ej5.feature.socio.dtos.response;
package com.programacion4.unidad4ej5.feature.socio.dtos.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class SocioResponseDTO {
    private String mensaje;
    private SocioCreateDTO socio;
    
}
