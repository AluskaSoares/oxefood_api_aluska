package br.com.ifpe.oxefood.modelo.entregador;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntregadorService {
    @Autowired
    private EntregadorRepository repository;

    @Transactional
    public Entregador save(Entregador entregador) {

        entregador.setHabilitado(Boolean.TRUE);
        entregador.setVersao(1L);
        entregador.setDataCriacao(LocalDate.now());
        return repository.save(entregador);
    }

    public List<Entregador> findAll() {

        return repository.findAll();
    }

    public Entregador findById(Long id) {

        return repository.findById(id).get();
    }

    @Transactional
    public void update(Long id, Entregador entregadorAlterado) {

        Entregador entregador = repository.findById(id).get();
        entregador.setNome(entregadorAlterado.getNome());
        entregador.setDataNascimento(entregadorAlterado.getDataNascimento());
        entregador.setCpf(entregadorAlterado.getCpf());
        entregador.setFoneCelular(entregadorAlterado.getFoneCelular());
        entregador.setFoneFixo(entregadorAlterado.getFoneFixo());

        entregador.setVersao(entregador.getVersao() + 1);
        repository.save(entregador);
    }

}


