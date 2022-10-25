package whgw.study.apipractice.model;

/**
 * Table: items
 */

import lombok.Data;

@Data
public class Items {
    /**
     * Column: id
     * Type: INT
     */
    private Integer id;

    /**
     * Column: name
     * Type: VARCHAR(100)
     */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}