package dev.java10.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MissoesService {
    private final MissoesRepository missoesRepository;
    private final MissoesMapper missoesMapper;

    public MissoesService(MissoesRepository missoesRepository, MissoesMapper missoesMapper) {
        this.missoesRepository = missoesRepository;
        this.missoesMapper = missoesMapper;
    }

    public List<MissoesDTO> listarMissoes(){
        List<MissoesModel> missoes = missoesRepository.findAll();
        return missoes.stream().map(missoesMapper::map).collect(Collectors.toList());
    }

    public MissoesDTO listarMissaoId(Long id){
        Optional<MissoesModel> missoesId = missoesRepository.findById(id);
        return missoesId.map(missoesMapper::map).orElse(null);
    }

    public void deletarMissao(Long id){
        missoesRepository.deleteById(id);
    }

    public MissoesDTO adicionarMissao(MissoesDTO missoesDTO){
        MissoesModel missao = missoesMapper.map(missoesDTO);
        missoesRepository.save(missao);
        return missoesMapper.map(missao);
    }
}
