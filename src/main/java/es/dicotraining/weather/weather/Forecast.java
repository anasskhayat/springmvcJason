
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
    "code",
    "date",
    "day",
    "high",
    "low",
    "text"
})
public class Forecast {

    @JsonProperty("code")
    private String code;
    @JsonProperty("date")
    private String date;
    @JsonProperty("day")
    private String day;
    @JsonProperty("high")
    private String high;
    @JsonProperty("low")
    private String low;
    @JsonProperty("text")
    private String text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The code
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The date
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The day
     */
    @JsonProperty("day")
    public String getDay() {
        return day;
    }

    /**
     * 
     * @param day
     *     The day
     */
    @JsonProperty("day")
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * 
     * @return
     *     The high
     */
    @JsonProperty("high")
    public String getHigh() {
        return high;
    }

    /**
     * 
     * @param high
     *     The high
     */
    @JsonProperty("high")
    public void setHigh(String high) {
        this.high = high;
    }

    /**
     * 
     * @return
     *     The low
     */
    @JsonProperty("low")
    public String getLow() {
        return low;
    }

    /**
     * 
     * @param low
     *     The low
     */
    @JsonProperty("low")
    public void setLow(String low) {
        this.low = low;
    }

    /**
     * 
     * @return
     *     The text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
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
        if ("code".equals(name)) {
            if (value instanceof String) {
                setCode(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"code\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("date".equals(name)) {
                if (value instanceof String) {
                    setDate(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"date\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("day".equals(name)) {
                    if (value instanceof String) {
                        setDay(((String) value));
                    } else {
                        throw new IllegalArgumentException(("property \"day\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("high".equals(name)) {
                        if (value instanceof String) {
                            setHigh(((String) value));
                        } else {
                            throw new IllegalArgumentException(("property \"high\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("low".equals(name)) {
                            if (value instanceof String) {
                                setLow(((String) value));
                            } else {
                                throw new IllegalArgumentException(("property \"low\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("text".equals(name)) {
                                if (value instanceof String) {
                                    setText(((String) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"text\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                }
                                return true;
                            } else {
                                return false;
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("code".equals(name)) {
            return getCode();
        } else {
            if ("date".equals(name)) {
                return getDate();
            } else {
                if ("day".equals(name)) {
                    return getDay();
                } else {
                    if ("high".equals(name)) {
                        return getHigh();
                    } else {
                        if ("low".equals(name)) {
                            return getLow();
                        } else {
                            if ("text".equals(name)) {
                                return getText();
                            } else {
                                return notFoundValue;
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Forecast.NOT_FOUND_VALUE);
        if (Forecast.NOT_FOUND_VALUE!= value) {
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
        return new HashCodeBuilder().append(code).append(date).append(day).append(high).append(low).append(text).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Forecast) == false) {
            return false;
        }
        Forecast rhs = ((Forecast) other);
        return new EqualsBuilder().append(code, rhs.code).append(date, rhs.date).append(day, rhs.day).append(high, rhs.high).append(low, rhs.low).append(text, rhs.text).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
