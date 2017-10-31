
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
    "count",
    "created",
    "lang",
    "diagnostics",
    "results"
})
public class Query {

    @JsonProperty("count")
    private Integer count;
    @JsonProperty("created")
    private String created;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("diagnostics")
    private Diagnostics diagnostics;
    @JsonProperty("results")
    private Results results;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The count
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The created
     */
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    /**
     * 
     * @param created
     *     The created
     */
    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

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
     *     The diagnostics
     */
    @JsonProperty("diagnostics")
    public Diagnostics getDiagnostics() {
        return diagnostics;
    }

    /**
     * 
     * @param diagnostics
     *     The diagnostics
     */
    @JsonProperty("diagnostics")
    public void setDiagnostics(Diagnostics diagnostics) {
        this.diagnostics = diagnostics;
    }

    /**
     * 
     * @return
     *     The results
     */
    @JsonProperty("results")
    public Results getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The results
     */
    @JsonProperty("results")
    public void setResults(Results results) {
        this.results = results;
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
        if ("count".equals(name)) {
            if (value instanceof Integer) {
                setCount(((Integer) value));
            } else {
                throw new IllegalArgumentException(("property \"count\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("created".equals(name)) {
                if (value instanceof String) {
                    setCreated(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"created\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("lang".equals(name)) {
                    if (value instanceof String) {
                        setLang(((String) value));
                    } else {
                        throw new IllegalArgumentException(("property \"lang\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("diagnostics".equals(name)) {
                        if (value instanceof Diagnostics) {
                            setDiagnostics(((Diagnostics) value));
                        } else {
                            throw new IllegalArgumentException(("property \"diagnostics\" is of type \"es.dicotraining.weather.places.Diagnostics\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("results".equals(name)) {
                            if (value instanceof Results) {
                                setResults(((Results) value));
                            } else {
                                throw new IllegalArgumentException(("property \"results\" is of type \"es.dicotraining.weather.places.Results\", but got "+ value.getClass().toString()));
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
        if ("count".equals(name)) {
            return getCount();
        } else {
            if ("created".equals(name)) {
                return getCreated();
            } else {
                if ("lang".equals(name)) {
                    return getLang();
                } else {
                    if ("diagnostics".equals(name)) {
                        return getDiagnostics();
                    } else {
                        if ("results".equals(name)) {
                            return getResults();
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
        Object value = declaredPropertyOrNotFound(name, Query.NOT_FOUND_VALUE);
        if (Query.NOT_FOUND_VALUE!= value) {
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
        return new HashCodeBuilder().append(count).append(created).append(lang).append(diagnostics).append(results).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Query) == false) {
            return false;
        }
        Query rhs = ((Query) other);
        return new EqualsBuilder().append(count, rhs.count).append(created, rhs.created).append(lang, rhs.lang).append(diagnostics, rhs.diagnostics).append(results, rhs.results).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
