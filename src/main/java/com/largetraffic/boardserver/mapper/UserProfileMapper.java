package com.largetraffic.boardserver.mapper;

import com.largetraffic.boardserver.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper //Mapper임을 타나내는  Annotation
public interface UserProfileMapper {

    public UserDTO getUserProfile(@Param("id") String id);












    int insertUserProfile(@Param("id") String id,   @Param("password") String password,
        @Param("name") String name,  @Param("phone") String phone,
        @Param("address") String address, @Param("createTime") String createTime,
        @Param("updateTime") String updateTime);

    int deleteUserProfile(@Param("id")String id);

    public UserDTO findByIdAndPassword(@Param("id") String id, @Param("password") String password);
    
    int idDuplicated(@Param("id") String id);

    public int updatePassword(UserDTO user);

    public int updateAddress(UserDTO user);
}
