package MSA.IMFLIX.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "series")
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","serie_comments"})
public class Serie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	@PrimaryKeyJoinColumn
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "cast_")
	private String cast;

	//category_id
	@ManyToOne(targetEntity = Category.class,fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "category_id")
	private Category category;
	
	@JsonIgnore
	@OneToMany(mappedBy = "serie")
	private List<SerieComment> serieComments;

}
