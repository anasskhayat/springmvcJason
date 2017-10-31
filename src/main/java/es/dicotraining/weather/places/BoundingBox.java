
package es.dicotraining.weather.places;

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
    "southWest",
    "northEast"
})
public class BoundingBox {

    @JsonProperty("southWest")
    private SouthWest southWest;
    @JsonProperty("northEast")
    private NorthEast northEast;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The southWest
     */
    @JsonProperty("southWest")
    public SouthWest getSouthWest() {
        return southWest;
    }

    /**
     * 
     * @param southWest
     *     The southWest
     */
    @JsonProperty("southWest")
    public void setSouthWest(SouthWest southWest) {
        this.southWest = southWest;
    }

    /**
     * 
     * @return
     *     The northEast
     */
    @JsonProperty("northEast")
    public NorthEast getNorthEast() {
        return northEast;
    }

    /**
     * 
     * @param northEast
     *     The northEast
     */
    @JsonProperty("northEast")
    public void setNorthEast(NorthEast northEast) {
        this.northEast = northEast;
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
        if ("southWest".equals(name)) {
            if (value instanceof SouthWest) {
                setSouthWest(((SouthWest) value));
            } else {
                throw new IllegalArgumentException(("property \"southWest\" is of type \"es.dicotraining.weather.places.SouthWest\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("northEast".equals(name)) {
                if (value instanceof NorthEast) {
                    setNorthEast(((NorthEast) value));
                } else {
                    throw new IllegalArgumentException(("property \"northEast\" is of type \"es.dicotraining.weather.places.NorthEast\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                return false;
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("southWest".equals(name)) {
            return getSouthWest();
        } else {
            if ("northEast".equals(name)) {
                return getNorthEast();
            } else {
                return notFoundValue;
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, BoundingBox.NOT_FOUND_VALUE);
        if (BoundingBox.NOT_FOUND_VALUE!= value) {
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
        return new HashCodeBuilder().append(southWest).append(northEast).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BoundingBox) == false) {
            return false;
        }
        BoundingBox rhs = ((BoundingBox) other);
        return new EqualsBuilder().append(southWest, rhs.southWest).append(northEast, rhs.northEast).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
