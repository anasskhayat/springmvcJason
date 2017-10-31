
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
    "publiclyCallable",
    "url",
    "user-time",
    "service-time",
    "build-version"
})
public class Diagnostics {

    @JsonProperty("publiclyCallable")
    private String publiclyCallable;
    @JsonProperty("url")
    private Url url;
    @JsonProperty("user-time")
    private String userTime;
    @JsonProperty("service-time")
    private String serviceTime;
    @JsonProperty("build-version")
    private String buildVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The publiclyCallable
     */
    @JsonProperty("publiclyCallable")
    public String getPubliclyCallable() {
        return publiclyCallable;
    }

    /**
     * 
     * @param publiclyCallable
     *     The publiclyCallable
     */
    @JsonProperty("publiclyCallable")
    public void setPubliclyCallable(String publiclyCallable) {
        this.publiclyCallable = publiclyCallable;
    }

    /**
     * 
     * @return
     *     The url
     */
    @JsonProperty("url")
    public Url getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    @JsonProperty("url")
    public void setUrl(Url url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The userTime
     */
    @JsonProperty("user-time")
    public String getUserTime() {
        return userTime;
    }

    /**
     * 
     * @param userTime
     *     The user-time
     */
    @JsonProperty("user-time")
    public void setUserTime(String userTime) {
        this.userTime = userTime;
    }

    /**
     * 
     * @return
     *     The serviceTime
     */
    @JsonProperty("service-time")
    public String getServiceTime() {
        return serviceTime;
    }

    /**
     * 
     * @param serviceTime
     *     The service-time
     */
    @JsonProperty("service-time")
    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime;
    }

    /**
     * 
     * @return
     *     The buildVersion
     */
    @JsonProperty("build-version")
    public String getBuildVersion() {
        return buildVersion;
    }

    /**
     * 
     * @param buildVersion
     *     The build-version
     */
    @JsonProperty("build-version")
    public void setBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
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
        if ("publiclyCallable".equals(name)) {
            if (value instanceof String) {
                setPubliclyCallable(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"publiclyCallable\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("url".equals(name)) {
                if (value instanceof Url) {
                    setUrl(((Url) value));
                } else {
                    throw new IllegalArgumentException(("property \"url\" is of type \"es.dicotraining.weather.weather.Url\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("user-time".equals(name)) {
                    if (value instanceof String) {
                        setUserTime(((String) value));
                    } else {
                        throw new IllegalArgumentException(("property \"user-time\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("service-time".equals(name)) {
                        if (value instanceof String) {
                            setServiceTime(((String) value));
                        } else {
                            throw new IllegalArgumentException(("property \"service-time\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("build-version".equals(name)) {
                            if (value instanceof String) {
                                setBuildVersion(((String) value));
                            } else {
                                throw new IllegalArgumentException(("property \"build-version\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
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

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("publiclyCallable".equals(name)) {
            return getPubliclyCallable();
        } else {
            if ("url".equals(name)) {
                return getUrl();
            } else {
                if ("user-time".equals(name)) {
                    return getUserTime();
                } else {
                    if ("service-time".equals(name)) {
                        return getServiceTime();
                    } else {
                        if ("build-version".equals(name)) {
                            return getBuildVersion();
                        } else {
                            return notFoundValue;
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
        Object value = declaredPropertyOrNotFound(name, Diagnostics.NOT_FOUND_VALUE);
        if (Diagnostics.NOT_FOUND_VALUE!= value) {
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
        return new HashCodeBuilder().append(publiclyCallable).append(url).append(userTime).append(serviceTime).append(buildVersion).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Diagnostics) == false) {
            return false;
        }
        Diagnostics rhs = ((Diagnostics) other);
        return new EqualsBuilder().append(publiclyCallable, rhs.publiclyCallable).append(url, rhs.url).append(userTime, rhs.userTime).append(serviceTime, rhs.serviceTime).append(buildVersion, rhs.buildVersion).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
