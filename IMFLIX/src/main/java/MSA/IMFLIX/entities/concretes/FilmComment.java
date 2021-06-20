package MSA.IMFLIX.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "film_comments")
public class FilmComment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	@PrimaryKeyJoinColumn
	private int id;
	
	@Column(name = "comment")
	private String comment;
	
	@Column(name = "comment_date",columnDefinition = "Date default CURRENT_DATE")
	private Date commentDate;
	
	//film_id
	@ManyToOne(targetEntity = Film.class,fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "film_id")
	private Film film;
	
	//user_id
	@ManyToOne(targetEntity = User.class,fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "user_id")
	private User user;
	
}
