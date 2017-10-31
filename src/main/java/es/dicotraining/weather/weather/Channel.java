
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
    "title",
    "link",
    "description",
    "language",
    "lastBuildDate",
    "ttl",
    "location",
    "units",
    "wind",
    "atmosphere",
    "astronomy",
    "image",
    "item"
})
public class Channel {

    @JsonProperty("title")
    private String title;
    @JsonProperty("link")
    private String link;
    @JsonProperty("description")
    private String description;
    @JsonProperty("language")
    private String language;
    @JsonProperty("lastBuildDate")
    private String lastBuildDate;
    @JsonProperty("ttl")
    private String ttl;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("units")
    private Units units;
    @JsonProperty("wind")
    private Wind wind;
    @JsonProperty("atmosphere")
    private Atmosphere atmosphere;
    @JsonProperty("astronomy")
    private Astronomy astronomy;
    @JsonProperty("image")
    private Image image;
    @JsonProperty("item")
    private Item item;
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
     *     The language
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 
     * @return
     *     The lastBuildDate
     */
    @JsonProperty("lastBuildDate")
    public String getLastBuildDate() {
        return lastBuildDate;
    }

    /**
     * 
     * @param lastBuildDate
     *     The lastBuildDate
     */
    @JsonProperty("lastBuildDate")
    public void setLastBuildDate(String lastBuildDate) {
        this.lastBuildDate = lastBuildDate;
    }

    /**
     * 
     * @return
     *     The ttl
     */
    @JsonProperty("ttl")
    public String getTtl() {
        return ttl;
    }

    /**
     * 
     * @param ttl
     *     The ttl
     */
    @JsonProperty("ttl")
    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    /**
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The units
     */
    @JsonProperty("units")
    public Units getUnits() {
        return units;
    }

    /**
     * 
     * @param units
     *     The units
     */
    @JsonProperty("units")
    public void setUnits(Units units) {
        this.units = units;
    }

    /**
     * 
     * @return
     *     The wind
     */
    @JsonProperty("wind")
    public Wind getWind() {
        return wind;
    }

    /**
     * 
     * @param wind
     *     The wind
     */
    @JsonProperty("wind")
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    /**
     * 
     * @return
     *     The atmosphere
     */
    @JsonProperty("atmosphere")
    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    /**
     * 
     * @param atmosphere
     *     The atmosphere
     */
    @JsonProperty("atmosphere")
    public void setAtmosphere(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
    }

    /**
     * 
     * @return
     *     The astronomy
     */
    @JsonProperty("astronomy")
    public Astronomy getAstronomy() {
        return astronomy;
    }

    /**
     * 
     * @param astronomy
     *     The astronomy
     */
    @JsonProperty("astronomy")
    public void setAstronomy(Astronomy astronomy) {
        this.astronomy = astronomy;
    }

    /**
     * 
     * @return
     *     The image
     */
    @JsonProperty("image")
    public Image getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    @JsonProperty("image")
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The item
     */
    @JsonProperty("item")
    public Item getItem() {
        return item;
    }

    /**
     * 
     * @param item
     *     The item
     */
    @JsonProperty("item")
    public void setItem(Item item) {
        this.item = item;
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
            if ("link".equals(name)) {
                if (value instanceof String) {
                    setLink(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"link\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
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
                    if ("language".equals(name)) {
                        if (value instanceof String) {
                            setLanguage(((String) value));
                        } else {
                            throw new IllegalArgumentException(("property \"language\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("lastBuildDate".equals(name)) {
                            if (value instanceof String) {
                                setLastBuildDate(((String) value));
                            } else {
                                throw new IllegalArgumentException(("property \"lastBuildDate\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("ttl".equals(name)) {
                                if (value instanceof String) {
                                    setTtl(((String) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"ttl\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                }
                                return true;
                            } else {
                                if ("location".equals(name)) {
                                    if (value instanceof Location) {
                                        setLocation(((Location) value));
                                    } else {
                                        throw new IllegalArgumentException(("property \"location\" is of type \"es.dicotraining.weather.weather.Location\", but got "+ value.getClass().toString()));
                                    }
                                    return true;
                                } else {
                                    if ("units".equals(name)) {
                                        if (value instanceof Units) {
                                            setUnits(((Units) value));
                                        } else {
                                            throw new IllegalArgumentException(("property \"units\" is of type \"es.dicotraining.weather.weather.Units\", but got "+ value.getClass().toString()));
                                        }
                                        return true;
                                    } else {
                                        if ("wind".equals(name)) {
                                            if (value instanceof Wind) {
                                                setWind(((Wind) value));
                                            } else {
                                                throw new IllegalArgumentException(("property \"wind\" is of type \"es.dicotraining.weather.weather.Wind\", but got "+ value.getClass().toString()));
                                            }
                                            return true;
                                        } else {
                                            if ("atmosphere".equals(name)) {
                                                if (value instanceof Atmosphere) {
                                                    setAtmosphere(((Atmosphere) value));
                                                } else {
                                                    throw new IllegalArgumentException(("property \"atmosphere\" is of type \"es.dicotraining.weather.weather.Atmosphere\", but got "+ value.getClass().toString()));
                                                }
                                                return true;
                                            } else {
                                                if ("astronomy".equals(name)) {
                                                    if (value instanceof Astronomy) {
                                                        setAstronomy(((Astronomy) value));
                                                    } else {
                                                        throw new IllegalArgumentException(("property \"astronomy\" is of type \"es.dicotraining.weather.weather.Astronomy\", but got "+ value.getClass().toString()));
                                                    }
                                                    return true;
                                                } else {
                                                    if ("image".equals(name)) {
                                                        if (value instanceof Image) {
                                                            setImage(((Image) value));
                                                        } else {
                                                            throw new IllegalArgumentException(("property \"image\" is of type \"es.dicotraining.weather.weather.Image\", but got "+ value.getClass().toString()));
                                                        }
                                                        return true;
                                                    } else {
                                                        if ("item".equals(name)) {
                                                            if (value instanceof Item) {
                                                                setItem(((Item) value));
                                                            } else {
                                                                throw new IllegalArgumentException(("property \"item\" is of type \"es.dicotraining.weather.weather.Item\", but got "+ value.getClass().toString()));
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
            if ("link".equals(name)) {
                return getLink();
            } else {
                if ("description".equals(name)) {
                    return getDescription();
                } else {
                    if ("language".equals(name)) {
                        return getLanguage();
                    } else {
                        if ("lastBuildDate".equals(name)) {
                            return getLastBuildDate();
                        } else {
                            if ("ttl".equals(name)) {
                                return getTtl();
                            } else {
                                if ("location".equals(name)) {
                                    return getLocation();
                                } else {
                                    if ("units".equals(name)) {
                                        return getUnits();
                                    } else {
                                        if ("wind".equals(name)) {
                                            return getWind();
                                        } else {
                                            if ("atmosphere".equals(name)) {
                                                return getAtmosphere();
                                            } else {
                                                if ("astronomy".equals(name)) {
                                                    return getAstronomy();
                                                } else {
                                                    if ("image".equals(name)) {
                                                        return getImage();
                                                    } else {
                                                        if ("item".equals(name)) {
                                                            return getItem();
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
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Channel.NOT_FOUND_VALUE);
        if (Channel.NOT_FOUND_VALUE!= value) {
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
        return new HashCodeBuilder().append(title).append(link).append(description).append(language).append(lastBuildDate).append(ttl).append(location).append(units).append(wind).append(atmosphere).append(astronomy).append(image).append(item).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Channel) == false) {
            return false;
        }
        Channel rhs = ((Channel) other);
        return new EqualsBuilder().append(title, rhs.title).append(link, rhs.link).append(description, rhs.description).append(language, rhs.language).append(lastBuildDate, rhs.lastBuildDate).append(ttl, rhs.ttl).append(location, rhs.location).append(units, rhs.units).append(wind, rhs.wind).append(atmosphere, rhs.atmosphere).append(astronomy, rhs.astronomy).append(image, rhs.image).append(item, rhs.item).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
