package spring.boot.optic.okulist.mapper;

import org.mapstruct.Mapper;
import spring.boot.optic.okulist.config.MapperConfig;
import spring.boot.optic.okulist.dto.user.UserRegistrationRequestDto;
import spring.boot.optic.okulist.dto.user.UserResponseDto;
import spring.boot.optic.okulist.model.RegisteredUser;
import spring.boot.optic.okulist.model.user.User;

@Mapper(config = MapperConfig.class)
public interface UserMapper {
    UserResponseDto toDto(RegisteredUser user);

    RegisteredUser toModel(UserRegistrationRequestDto userRequestDto);

    UserResponseDto toDtoUser(User user);
}
