package umn.mobile.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "request_header")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestHeader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_header_id", nullable = false, updatable = false)
    private Long request_header_id;

    @Column(name = "requested_by", columnDefinition = "VARCHAR(50)", nullable = false)
    private String requested_by;

    @Column(name = "request_date", nullable = false, updatable = false)
    private Date request_date;

    @Column(name = "number", nullable = false, updatable = false)
    private String number;

    @Column(name = "counter", nullable = false)
    private Integer counter;

    @Column(name = "rh_desc")
    private String rh_desc;

    @Column(name = "type", columnDefinition = "VARCHAR(20)", nullable = false)
    private String type;

    @Column(name = "app_status1", columnDefinition = "VARCHAR(10)", nullable = false)
    private String app_status1;

    @Column(name = "app_date1", nullable = false)
    private Date app_date1;

    @Column(name = "app_desc1")
    private String app_desc1;

    @Column(name = "app_by1", columnDefinition = "VARCHAR(50)", nullable = false)
    private String app_by1;

    @Column(name = "app_status2", columnDefinition = "VARCHAR(10)", nullable = false)
    private String app_status2;

    @Column(name = "app_date2", nullable = false)
    private Date app_date2;

    @Column(name = "app_desc2")
    private String app_desc2;

    @Column(name = "app_by2", columnDefinition = "VARCHAR(50)", nullable = false)
    private String app_by2;

    @Column(name = "app_status3", columnDefinition = "VARCHAR(10)", nullable = false)
    private String app_status3;

    @Column(name = "app_date3", nullable = false)
    private Date app_date3;

    @Column(name = "app_desc3")
    private String app_desc3;

    @Column(name = "app_by3", columnDefinition = "VARCHAR(50)", nullable = false)
    private String app_by3;

    @Column(name = "app_status4", columnDefinition = "VARCHAR(10)", nullable = false)
    private String app_status4;

    @Column(name = "app_date4", nullable = false)
    private Date app_date4;

    @Column(name = "app_desc4")
    private String app_desc4;

    @Column(name = "app_by4", columnDefinition = "VARCHAR(50)", nullable = false)
    private String app_by4;

    @Column(name = "total_trans", nullable = false)
    private Integer total_trans;

    @Column(name = "discount")
    private Integer discount;

    @Column(name = "ppn")
    private Integer ppn;

    @Column(name = "grand_total", nullable = false)
    private Integer grand_total;
}
