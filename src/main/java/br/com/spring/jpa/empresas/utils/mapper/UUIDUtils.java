package br.com.spring.jpa.empresas.utils.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.nio.ByteBuffer;
import java.util.UUID;

@Mapper
public interface UUIDUtils {

    UUIDUtils INSTANCE = Mappers.getMapper(UUIDUtils.class);

    default byte[] convertUUIDToBytes(UUID uuid) {
        ByteBuffer bb = ByteBuffer.wrap(new byte[16]);
        bb.putLong(uuid.getMostSignificantBits());
        bb.putLong(uuid.getLeastSignificantBits());
        return bb.array();
    }

    default UUID convertBytesToUUID(byte[] bytes) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        long high = byteBuffer.getLong();
        long low = byteBuffer.getLong();
        return new UUID(high, low);
    }

}
