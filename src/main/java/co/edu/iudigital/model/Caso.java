package co.edu.iudigital.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Caso implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8169358650902209853L;
	
	    //id INT NOT NULL AUTO_INCREMENT,
		@Id //PRIMARY KEY(id)
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
		//fecha_hora DATETIME NULL DEFAULT now(),
	    @Column(name = "fecha hora")
	    private Double fechaHora;
	    
		//latitud FLOAT NULL,
	    @Column(name = "latitud")
	    private Double latitud;
	    
		//longitud FLOAT NULL,
	    @Column(name = "longitud")
	    private Double longitud;
	    
		//altitud FLOAT NULL,
	    @Column(name = "altitud")
	    private Double altitud;
	    
	    
		//visible TINYINT NULL DEFAULT 1,
	    @Column(columnDefinition = "NULL DEFAULT 1")
		  private Boolean enabled;
	   
		//descripcion VARCHAR(200) NULL,
	    @Column(name = "descripcion", length = 200)
		private String descripcion;

		
	    //url_map TEXT NULL,
	    @Column(name = "url_map")
		 private Boolean urlMap;
	   
	    // rmi_url TEXT NULL,
	    @Column(name = "rmi_url")
		 private Boolean rmiUrl;
	   
	    // usuarios_id INT NOT NULL,
	    @Column(name = "usuarios", length = 120, nullable = false)
		private String usuariosId;
	    
	    //delitos_id INT NOT NULL,
	    @Column(name = "delitos_id", length = 200, nullable = false)
		private String delitosId;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Double getFechaHora() {
			return fechaHora;
		}

		public void setFechaHora(Double fechaHora) {
			this.fechaHora = fechaHora;
		}

		public Double getLatitud() {
			return latitud;
		}

		public void setLatitud(Double latitud) {
			this.latitud = latitud;
		}

		public Double getLongitud() {
			return longitud;
		}

		public void setLongitud(Double longitud) {
			this.longitud = longitud;
		}

		public Double getAltitud() {
			return altitud;
		}

		public void setAltitud(Double altitud) {
			this.altitud = altitud;
		}

		public Boolean getEnabled() {
			return enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public Boolean getUrlMap() {
			return urlMap;
		}

		public void setUrlMap(Boolean urlMap) {
			this.urlMap = urlMap;
		}

		public Boolean getRmiUrl() {
			return rmiUrl;
		}

		public void setRmiUrl(Boolean rmiUrl) {
			this.rmiUrl = rmiUrl;
		}

		public String getUsuariosId() {
			return usuariosId;
		}

		public void setUsuariosId(String usuariosId) {
			this.usuariosId = usuariosId;
		}

		public String getDelitosId() {
			return delitosId;
		}

		public void setDelitosId(String delitosId) {
			this.delitosId = delitosId;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	    
	    //FOREIGN KEY (usuarios_id) REFERENCES usuarios(id),
	    //FOREIGN KEY (delitos_id) REFERENCES delitos(id)
	

}




