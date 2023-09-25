package br.com.easymoney.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity(name = "Pagamentos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@SQLDelete(sql = "UPDATE Pagamentos SET deletado = true WHERE id = ?")
@Where(clause = "deletado = false")
public class Payment extends EntityPreset{

	private String loanId;
	
}
