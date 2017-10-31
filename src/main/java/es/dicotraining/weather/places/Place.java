
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
    "lang",
    "xmlns",
    "yahoo",
    "uri",
    "woeid",
    "placeTypeName",
    "name",
    "country",
    "admin1",
    "admin2",
    "admin3",
    "locality1",
    "locality2",
    "postal",
    "centroid",
    "boundingBox",
    "areaRank",
    "popRank",
    "timezone"
})
public class Place {

    @JsonProperty("lang")
    private String lang;
    @JsonProperty("xmlns")
    private String xmlns;
    @JsonProperty("yahoo")
    private String yahoo;
    @JsonProperty("uri")
    private String uri;
    @JsonProperty("woeid")
    private String woeid;
    @JsonProperty("placeTypeName")
    private PlaceTypeName placeTypeName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("country")
    private Country country;
    @JsonProperty("admin1")
    private Admin1 admin1;
    @JsonProperty("admin2")
    private Admin2 admin2;
    @JsonProperty("admin3")
    private Object admin3;
    @JsonProperty("locality1")
    private Locality1 locality1;
    @JsonProperty("locality2")
    private Object locality2;
    @JsonProperty("postal")
    private Object postal;
    @JsonProperty("centroid")
    private Centroid centroid;
    @JsonProperty("boundingBox")
    private BoundingBox boundingBox;
    @JsonProperty("areaRank")
    private String areaRank;
    @JsonProperty("popRank")
    private String popRank;
    @JsonProperty("timezone")
    private Timezone timezone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The lang
     */
    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    /**
     * 
     * @param lang
     *     The lang
     */
    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * 
     * @return
     *     The xmlns
     */
    @JsonProperty("xmlns")
    public String getXmlns() {
        return xmlns;
    }

    /**
     * 
     * @param xmlns
     *     The xmlns
     */
    @JsonProperty("xmlns")
    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    /**
     * 
     * @return
     *     The yahoo
     */
    @JsonProperty("yahoo")
    public String getYahoo() {
        return yahoo;
    }

    /**
     * 
     * @param yahoo
     *     The yahoo
     */
    @JsonProperty("yahoo")
    public void setYahoo(String yahoo) {
        this.yahoo = yahoo;
    }

    /**
     * 
     * @return
     *     The uri
     */
    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    /**
     * 
     * @param uri
     *     The uri
     */
    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * 
     * @return
     *     The woeid
     */
    @JsonProperty("woeid")
    public String getWoeid() {
        return woeid;
    }

    /**
     * 
     * @param woeid
     *     The woeid
     */
    @JsonProperty("woeid")
    public void setWoeid(String woeid) {
        this.woeid = woeid;
    }

    /**
     * 
     * @return
     *     The placeTypeName
     */
    @JsonProperty("placeTypeName")
    public PlaceTypeName getPlaceTypeName() {
        return placeTypeName;
    }

    /**
     * 
     * @param placeTypeName
     *     The placeTypeName
     */
    @JsonProperty("placeTypeName")
    public void setPlaceTypeName(PlaceTypeName placeTypeName) {
        this.placeTypeName = placeTypeName;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The country
     */
    @JsonProperty("country")
    public Country getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    @JsonProperty("country")
    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The admin1
     */
    @JsonProperty("admin1")
    public Admin1 getAdmin1() {
        return admin1;
    }

    /**
     * 
     * @param admin1
     *     The admin1
     */
    @JsonProperty("admin1")
    public void setAdmin1(Admin1 admin1) {
        this.admin1 = admin1;
    }

    /**
     * 
     * @return
     *     The admin2
     */
    @JsonProperty("admin2")
    public Admin2 getAdmin2() {
        return admin2;
    }

    /**
     * 
     * @param admin2
     *     The admin2
     */
    @JsonProperty("admin2")
    public void setAdmin2(Admin2 admin2) {
        this.admin2 = admin2;
    }

    /**
     * 
     * @return
     *     The admin3
     */
    @JsonProperty("admin3")
    public Object getAdmin3() {
        return admin3;
    }

    /**
     * 
     * @param admin3
     *     The admin3
     */
    @JsonProperty("admin3")
    public void setAdmin3(Object admin3) {
        this.admin3 = admin3;
    }

    /**
     * 
     * @return
     *     The locality1
     */
    @JsonProperty("locality1")
    public Locality1 getLocality1() {
        return locality1;
    }

    /**
     * 
     * @param locality1
     *     The locality1
     */
    @JsonProperty("locality1")
    public void setLocality1(Locality1 locality1) {
        this.locality1 = locality1;
    }

    /**
     * 
     * @return
     *     The locality2
     */
    @JsonProperty("locality2")
    public Object getLocality2() {
        return locality2;
    }

    /**
     * 
     * @param locality2
     *     The locality2
     */
    @JsonProperty("locality2")
    public void setLocality2(Object locality2) {
        this.locality2 = locality2;
    }

    /**
     * 
     * @return
     *     The postal
     */
    @JsonProperty("postal")
    public Object getPostal() {
        return postal;
    }

    /**
     * 
     * @param postal
     *     The postal
     */
    @JsonProperty("postal")
    public void setPostal(Object postal) {
        this.postal = postal;
    }

    /**
     * 
     * @return
     *     The centroid
     */
    @JsonProperty("centroid")
    public Centroid getCentroid() {
        return centroid;
    }

    /**
     * 
     * @param centroid
     *     The centroid
     */
    @JsonProperty("centroid")
    public void setCentroid(Centroid centroid) {
        this.centroid = centroid;
    }

    /**
     * 
     * @return
     *     The boundingBox
     */
    @JsonProperty("boundingBox")
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    /**
     * 
     * @param boundingBox
     *     The boundingBox
     */
    @JsonProperty("boundingBox")
    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * 
     * @return
     *     The areaRank
     */
    @JsonProperty("areaRank")
    public String getAreaRank() {
        return areaRank;
    }

    /**
     * 
     * @param areaRank
     *     The areaRank
     */
    @JsonProperty("areaRank")
    public void setAreaRank(String areaRank) {
        this.areaRank = areaRank;
    }

    /**
     * 
     * @return
     *     The popRank
     */
    @JsonProperty("popRank")
    public String getPopRank() {
        return popRank;
    }

    /**
     * 
     * @param popRank
     *     The popRank
     */
    @JsonProperty("popRank")
    public void setPopRank(String popRank) {
        this.popRank = popRank;
    }

    /**
     * 
     * @return
     *     The timezone
     */
    @JsonProperty("timezone")
    public Timezone getTimezone() {
        return timezone;
    }

    /**
     * 
     * @param timezone
     *     The timezone
     */
    @JsonProperty("timezone")
    public void setTimezone(Timezone timezone) {
        this.timezone = timezone;
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
        if ("lang".equals(name)) {
            if (value instanceof String) {
                setLang(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"lang\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("xmlns".equals(name)) {
                if (value instanceof String) {
                    setXmlns(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"xmlns\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("yahoo".equals(name)) {
                    if (value instanceof String) {
                        setYahoo(((String) value));
                    } else {
                        throw new IllegalArgumentException(("property \"yahoo\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("uri".equals(name)) {
                        if (value instanceof String) {
                            setUri(((String) value));
                        } else {
                            throw new IllegalArgumentException(("property \"uri\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("woeid".equals(name)) {
                            if (value instanceof String) {
                                setWoeid(((String) value));
                            } else {
                                throw new IllegalArgumentException(("property \"woeid\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("placeTypeName".equals(name)) {
                                if (value instanceof PlaceTypeName) {
                                    setPlaceTypeName(((PlaceTypeName) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"placeTypeName\" is of type \"es.dicotraining.weather.places.PlaceTypeName\", but got "+ value.getClass().toString()));
                                }
                                return true;
                            } else {
                                if ("name".equals(name)) {
                                    if (value instanceof String) {
                                        setName(((String) value));
                                    } else {
                                        throw new IllegalArgumentException(("property \"name\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                    }
                                    return true;
                                } else {
                                    if ("country".equals(name)) {
                                        if (value instanceof Country) {
                                            setCountry(((Country) value));
                                        } else {
                                            throw new IllegalArgumentException(("property \"country\" is of type \"es.dicotraining.weather.places.Country\", but got "+ value.getClass().toString()));
                                        }
                                        return true;
                                    } else {
                                        if ("admin1".equals(name)) {
                                            if (value instanceof Admin1) {
                                                setAdmin1(((Admin1) value));
                                            } else {
                                                throw new IllegalArgumentException(("property \"admin1\" is of type \"es.dicotraining.weather.places.Admin1\", but got "+ value.getClass().toString()));
                                            }
                                            return true;
                                        } else {
                                            if ("admin2".equals(name)) {
                                                if (value instanceof Admin2) {
                                                    setAdmin2(((Admin2) value));
                                                } else {
                                                    throw new IllegalArgumentException(("property \"admin2\" is of type \"es.dicotraining.weather.places.Admin2\", but got "+ value.getClass().toString()));
                                                }
                                                return true;
                                            } else {
                                                if ("admin3".equals(name)) {
                                                    if (value instanceof Object) {
                                                        setAdmin3(((Object) value));
                                                    } else {
                                                        throw new IllegalArgumentException(("property \"admin3\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                    }
                                                    return true;
                                                } else {
                                                    if ("locality1".equals(name)) {
                                                        if (value instanceof Locality1) {
                                                            setLocality1(((Locality1) value));
                                                        } else {
                                                            throw new IllegalArgumentException(("property \"locality1\" is of type \"es.dicotraining.weather.places.Locality1\", but got "+ value.getClass().toString()));
                                                        }
                                                        return true;
                                                    } else {
                                                        if ("locality2".equals(name)) {
                                                            if (value instanceof Object) {
                                                                setLocality2(((Object) value));
                                                            } else {
                                                                throw new IllegalArgumentException(("property \"locality2\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                            }
                                                            return true;
                                                        } else {
                                                            if ("postal".equals(name)) {
                                                                if (value instanceof Object) {
                                                                    setPostal(((Object) value));
                                                                } else {
                                                                    throw new IllegalArgumentException(("property \"postal\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                                }
                                                                return true;
                                                            } else {
                                                                if ("centroid".equals(name)) {
                                                                    if (value instanceof Centroid) {
                                                                        setCentroid(((Centroid) value));
                                                                    } else {
                                                                        throw new IllegalArgumentException(("property \"centroid\" is of type \"es.dicotraining.weather.places.Centroid\", but got "+ value.getClass().toString()));
                                                                    }
                                                                    return true;
                                                                } else {
                                                                    if ("boundingBox".equals(name)) {
                                                                        if (value instanceof BoundingBox) {
                                                                            setBoundingBox(((BoundingBox) value));
                                                                        } else {
                                                                            throw new IllegalArgumentException(("property \"boundingBox\" is of type \"es.dicotraining.weather.places.BoundingBox\", but got "+ value.getClass().toString()));
                                                                        }
                                                                        return true;
                                                                    } else {
                                                                        if ("areaRank".equals(name)) {
                                                                            if (value instanceof String) {
                                                                                setAreaRank(((String) value));
                                                                            } else {
                                                                                throw new IllegalArgumentException(("property \"areaRank\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                            }
                                                                            return true;
                                                                        } else {
                                                                            if ("popRank".equals(name)) {
                                                                                if (value instanceof String) {
                                                                                    setPopRank(((String) value));
                                                                                } else {
                                                                                    throw new IllegalArgumentException(("property \"popRank\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                                }
                                                                                return true;
                                                                            } else {
                                                                                if ("timezone".equals(name)) {
                                                                                    if (value instanceof Timezone) {
                                                                                        setTimezone(((Timezone) value));
                                                                                    } else {
                                                                                        throw new IllegalArgumentException(("property \"timezone\" is of type \"es.dicotraining.weather.places.Timezone\", but got "+ value.getClass().toString()));
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
        if ("lang".equals(name)) {
            return getLang();
        } else {
            if ("xmlns".equals(name)) {
                return getXmlns();
            } else {
                if ("yahoo".equals(name)) {
                    return getYahoo();
                } else {
                    if ("uri".equals(name)) {
                        return getUri();
                    } else {
                        if ("woeid".equals(name)) {
                            return getWoeid();
                        } else {
                            if ("placeTypeName".equals(name)) {
                                return getPlaceTypeName();
                            } else {
                                if ("name".equals(name)) {
                                    return getName();
                                } else {
                                    if ("country".equals(name)) {
                                        return getCountry();
                                    } else {
                                        if ("admin1".equals(name)) {
                                            return getAdmin1();
                                        } else {
                                            if ("admin2".equals(name)) {
                                                return getAdmin2();
                                            } else {
                                                if ("admin3".equals(name)) {
                                                    return getAdmin3();
                                                } else {
                                                    if ("locality1".equals(name)) {
                                                        return getLocality1();
                                                    } else {
                                                        if ("locality2".equals(name)) {
                                                            return getLocality2();
                                                        } else {
                                                            if ("postal".equals(name)) {
                                                                return getPostal();
                                                            } else {
                                                                if ("centroid".equals(name)) {
                                                                    return getCentroid();
                                                                } else {
                                                                    if ("boundingBox".equals(name)) {
                                                                        return getBoundingBox();
                                                                    } else {
                                                                        if ("areaRank".equals(name)) {
                                                                            return getAreaRank();
                                                                        } else {
                                                                            if ("popRank".equals(name)) {
                                                                                return getPopRank();
                                                                            } else {
                                                                                if ("timezone".equals(name)) {
                                                                                    return getTimezone();
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
        Object value = declaredPropertyOrNotFound(name, Place.NOT_FOUND_VALUE);
        if (Place.NOT_FOUND_VALUE!= value) {
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
        return new HashCodeBuilder().append(lang).append(xmlns).append(yahoo).append(uri).append(woeid).append(placeTypeName).append(name).append(country).append(admin1).append(admin2).append(admin3).append(locality1).append(locality2).append(postal).append(centroid).append(boundingBox).append(areaRank).append(popRank).append(timezone).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Place) == false) {
            return false;
        }
        Place rhs = ((Place) other);
        return new EqualsBuilder().append(lang, rhs.lang).append(xmlns, rhs.xmlns).append(yahoo, rhs.yahoo).append(uri, rhs.uri).append(woeid, rhs.woeid).append(placeTypeName, rhs.placeTypeName).append(name, rhs.name).append(country, rhs.country).append(admin1, rhs.admin1).append(admin2, rhs.admin2).append(admin3, rhs.admin3).append(locality1, rhs.locality1).append(locality2, rhs.locality2).append(postal, rhs.postal).append(centroid, rhs.centroid).append(boundingBox, rhs.boundingBox).append(areaRank, rhs.areaRank).append(popRank, rhs.popRank).append(timezone, rhs.timezone).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
