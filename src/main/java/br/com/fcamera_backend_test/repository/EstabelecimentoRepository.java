package br.com.fcamera_backend_test.repository;

import br.com.fcamera_backend_test.domain.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, String> {
    Optional<Estabelecimento> findByCnpj(String cnpj);
}
