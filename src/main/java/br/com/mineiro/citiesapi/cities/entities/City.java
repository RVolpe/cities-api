package br.com.mineiro.citiesapi.cities.entities;

import br.com.mineiro.citiesapi.states.State;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;
import javax.persistence.*;

@Entity
@Table(name = "cidade")
@TypeDefs(value = {
        @TypeDef(name = "point", typeClass = PointType.class)
})
public class City {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    // 1st
    //private Integer uf;

    // 2nd - @ManyToOne
    @ManyToOne
    @JoinColumn(name = "uf", referencedColumnName = "id")
    private State uf;

    private Integer ibge;

    @Column(name = "lat_lon")
    private String geolocation;

    @Type(type = "point")
    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point location;

    public City() {
    }

    //1st
   /* public City(final Long id, final String name, final Integer uf, final Integer ibge,
                final String geolocation, final Point location) {*/

/*    public City(final Long id, final String name, final State uf, final Integer ibge,
                final String geolocation, final Point location) {
        this.id = id;
        this.name = name;
        this.uf = uf;
        this.ibge = ibge;
        //this.geolocation = geolocation;
        this.location = location;
    }*/

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // 1st
/*    public Integer getUf() {
        return uf;
    }*/

    public State getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public String getGeolocation() {
        return geolocation;
    }

    public Point getLocation() {
        return location;
    }
}
