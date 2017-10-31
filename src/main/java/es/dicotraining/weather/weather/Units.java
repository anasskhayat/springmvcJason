
package es.dicotraining.weather.weather;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "distance",
    "pressure",
    "speed",
    "temperature"
})
public class Units {

    @JsonProperty("distance")
    private String distance;
    @JsonProperty("pressure")
    private String pressure;
    @JsonProperty("speed")
    private String speed;
    @JsonProperty("temperature")
    private String temperature;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The distance
     */
    @JsonProperty("distance")
    public String getDistance() {
        return distance;
    }

    /**
     * 
     * @param distance
     *     The distance
     */
    @JsonProperty("distance")
    public void setDistance(String distance) {
        this.distance = distance;
    }

    /**
     * 
     * @return
     *     The pressure
     */
    @JsonProperty("pressure")
    public String getPressure() {
        return pressure;
    }

    /**
     * 
     * @param pressure
     *     The pressure
     */
    @JsonProperty("pressure")
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    /**
     * 
     * @return
     *     The speed
     */
    @JsonProperty("speed")
    public String getSpeed() {
        return speed;
    }

    /**
     * 
     * @param speed
     *     The speed
     */
    @JsonProperty("speed")
    public void setSpeed(String speed) {
        this.speed = speed;
    }

    /**
     * 
     * @return
     *     The temperature
     */
    @JsonProperty("temperature")
    public String getTemperature() {
        return temperature;
    }

    /**
     * 
     * @param temperature
     *     The temperature
     */
    @JsonProperty("temperature")
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected boolean declaredProperty(String name, Object value) {
        if ("distance".equals(name)) {
            if (value instanceof String) {
                setDistance(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"distance\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("pressure".equals(name)) {
                if (value instanceof String) {
                    setPressure(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"pressure\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("speed".equals(name)) {
                    if (value instanceof String) {
                        setSpeed(((String) value));
                    } else {
                        throw new IllegalArgumentException(("property \"speed\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("temperature".equals(name)) {
                        if (value instanceof String) {
                            setTemperature(((String) value));
                        } else {
                            throw new IllegalArgumentException(("property \"temperature\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("distance".equals(name)) {
            return getDistance();
        } else {
            if ("pressure".equals(name)) {
                return getPressure();
            } else {
                if ("speed".equals(name)) {
                    return getSpeed();
                } else {
                    if ("temperature".equals(name)) {
                        return getTemperature();
                    } else {
                        return notFoundValue;
                    }
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Units.NOT_FOUND_VALUE);
        if (Units.NOT_FOUND_VALUE!= value) {
            return ((T) value);
        } else {
            return ((T) getAdditionalProperties().get(name));
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public void set(String name, Object value) {
        if (!declaredProperty(name, value)) {
            getAdditionalProperties().put(name, ((Object) value));
        }
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(distance).append(pressure).append(speed).append(temperature).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Units) == false) {
            return false;
        }
        Units rhs = ((Units) other);
        return new EqualsBuilder().append(distance, rhs.distance).append(pressure, rhs.pressure).append(speed, rhs.speed).append(temperature, rhs.temperature).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
