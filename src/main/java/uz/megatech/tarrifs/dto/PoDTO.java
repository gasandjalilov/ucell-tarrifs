package uz.megatech.tarrifs.dto;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

@Value(staticConstructor = "of")
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
public class PoDTO implements Serializable {
}
