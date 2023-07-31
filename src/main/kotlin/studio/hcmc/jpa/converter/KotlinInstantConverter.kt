package studio.hcmc.jpa.converter

import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter
import kotlinx.datetime.toJavaInstant
import kotlinx.datetime.toKotlinInstant
import kotlinx.datetime.Instant as KInstant
import java.time.Instant as JInstant

@Converter
class KotlinInstantConverter : AttributeConverter<KInstant, JInstant> {
    override fun convertToDatabaseColumn(attribute: KInstant?): JInstant {
        return attribute!!.toJavaInstant()
    }

    override fun convertToEntityAttribute(dbData: JInstant?): KInstant {
        return dbData!!.toKotlinInstant()
    }
}