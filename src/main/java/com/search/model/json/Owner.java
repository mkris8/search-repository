
package com.search.model.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Owner {

    @SerializedName("login")
    @Expose
    private String login;

    /**
     * 
     * @return
     *     The login
     */
    public String getLogin() {
        return login;
    }

    /**
     * 
     * @param login
     *     The login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(login).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Owner) == false) {
            return false;
        }
        Owner rhs = ((Owner) other);
        return new EqualsBuilder().append(login, rhs.login).isEquals();
    }

}
