
package es.dicotraining.weather.weather;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "title",
    "lat",
    "long",
    "link",
    "pubDate",
    "condition",
    "description",
    "forecast",
    "guid"
})
public class Item {

    @JsonProperty("title")
    private String title;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("long")
    private String _long;
    @JsonProperty("link")
    private String link;
    @JsonProperty("pubDate")
    private String pubDate;
    @JsonProperty("condition")
    private Condition condition;
    @JsonProperty("description")
    private String description;
    @JsonProperty("forecast")
    private List<Forecast> forecast = new ArrayList<Forecast>();
    @JsonProperty("guid")
    private Guid guid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The lat
     */
    @JsonProperty("lat")
    public String getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    @JsonProperty("lat")
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * 
     * @return
     *     The _long
     */
    @JsonProperty("long")
    public String getLong() {
        return _long;
    }

    /**
     * 
     * @param _long
     *     The long
     */
    @JsonProperty("long")
    public void setLong(String _long) {
        this._long = _long;
    }

    /**
     * 
     * @return
     *     The link
     */
    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The pubDate
     */
    @JsonProperty("pubDate")
    public String getPubDate() {
        return pubDate;
    }

    /**
     * 
     * @param pubDate
     *     The pubDate
     */
    @JsonProperty("pubDate")
    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    /**
     * 
     * @return
     *     The condition
     */
    @JsonProperty("condition")
    public Condition getCondition() {
        return condition;
    }

    /**
     * 
     * @param condition
     *     The condition
     */
    @JsonProperty("condition")
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The forecast
     */
    @JsonProperty("forecast")
    public List<Forecast> getForecast() {
        return forecast;
    }

    /**
     * 
     * @param forecast
     *     The forecast
     */
    @JsonProperty("forecast")
    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }

    /**
     * 
     * @return
     *     The guid
     */
    @JsonProperty("guid")
    public Guid getGuid() {
        return guid;
    }

    /**
     * 
     * @param guid
     *     The guid
     */
    @JsonProperty("guid")
    public void setGuid(Guid guid) {
        this.guid = guid;
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
        if ("title".equals(name)) {
            if (value instanceof String) {
                setTitle(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"title\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("lat".equals(name)) {
                if (value instanceof String) {
                    setLat(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"lat\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("long".equals(name)) {
                    if (value instanceof String) {
                        setLong(((String) value));
                    } else {
                        throw new IllegalArgumentException(("property \"long\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("link".equals(name)) {
                        if (value instanceof String) {
                            setLink(((String) value));
                        } else {
                            throw new IllegalArgumentException(("property \"link\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("pubDate".equals(name)) {
                            if (value instanceof String) {
                                setPubDate(((String) value));
                            } else {
                                throw new IllegalArgumentException(("property \"pubDate\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("condition".equals(name)) {
                                if (value instanceof Condition) {
                                    setCondition(((Condition) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"condition\" is of type \"es.dicotraining.weather.weather.Condition\", but got "+ value.getClass().toString()));
                                }
                                return true;
                            } else {
                                if ("description".equals(name)) {
                                    if (value instanceof String) {
                                        setDescription(((String) value));
                                    } else {
                                        throw new IllegalArgumentException(("property \"description\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                    }
                                    return true;
                                } else {
                                    if ("forecast".equals(name)) {
                                        if (value instanceof List) {
                                            setForecast(((List<Forecast> ) value));
                                        } else {
                                            throw new IllegalArgumentException(("property \"forecast\" is of type \"java.util.List<es.dicotraining.weather.weather.Forecast>\", but got "+ value.getClass().toString()));
                                        }
                                        return true;
                                    } else {
                                        if ("guid".equals(name)) {
                                            if (value instanceof Guid) {
                                                setGuid(((Guid) value));
                                            } else {
                                                throw new IllegalArgumentException(("property \"guid\" is of type \"es.dicotraining.weather.weather.Guid\", but got "+ value.getClass().toString()));
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
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("title".equals(name)) {
            return getTitle();
        } else {
            if ("lat".equals(name)) {
                return getLat();
            } else {
                if ("long".equals(name)) {
                    return getLong();
                } else {
                    if ("link".equals(name)) {
                        return getLink();
                    } else {
                        if ("pubDate".equals(name)) {
                            return getPubDate();
                        } else {
                            if ("condition".equals(name)) {
                                return getCondition();
                            } else {
                                if ("description".equals(name)) {
                                    return getDescription();
                                } else {
                                    if ("forecast".equals(name)) {
                                        return getForecast();
                                    } else {
                                        if ("guid".equals(name)) {
                                            return getGuid();
                                        } else {
                                            return notFoundValue;
                                        }
                                    }
                                }
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
        Object value = declaredPropertyOrNotFound(name, Item.NOT_FOUND_VALUE);
        if (Item.NOT_FOUND_VALUE!= value) {
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
        return new HashCodeBuilder().append(title).append(lat).append(_long).append(link).append(pubDate).append(condition).append(description).append(forecast).append(guid).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item) == false) {
            return false;
        }
        Item rhs = ((Item) other);
        return new EqualsBuilder().append(title, rhs.title).append(lat, rhs.lat).append(_long, rhs._long).append(link, rhs.link).append(pubDate, rhs.pubDate).append(condition, rhs.condition).append(description, rhs.description).append(forecast, rhs.forecast).append(guid, rhs.guid).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
