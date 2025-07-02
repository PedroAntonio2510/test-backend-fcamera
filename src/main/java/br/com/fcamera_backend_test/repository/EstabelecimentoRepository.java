package br.com.fcamera_backend_test.repository;

import br.com.fcamera_backend_test.domain.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, String> {
}
