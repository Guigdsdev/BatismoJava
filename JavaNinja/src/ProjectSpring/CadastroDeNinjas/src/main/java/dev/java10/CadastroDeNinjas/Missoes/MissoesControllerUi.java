package dev.java10.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/missao/ui")
public class MissoesControllerUi {
    private final MissoesService missoesService;

    public MissoesControllerUi(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping("/listar")
    public String listarMissao(Model model){
        List<MissoesDTO> missoes = missoesService.listarMissoes();
        model.addAttribute("missoes", missoes);
        return "listarMissoes";
    }

    @GetMapping("/deletar/{id}")
    public String deletarMissao(@PathVariable Long id){
        missoesService.deletarMissao(id);
        return "redirect:/missao/ui/listar";
    }

    @GetMapping("/adicionar")
    public String criarMissaoPagina(Model model){
        model.addAttribute("missao", new MissoesDTO());
        return "criarMissao";
    }

    @PostMapping("/salvar")
    public String criarMissao(MissoesDTO missao, RedirectAttributes redirectAttributes){
        missoesService.adicionarMissao(missao);
        redirectAttributes.addFlashAttribute("mensagem", "Missão criada com sucesso");
        return "redirect:/missao/ui/listar";
    }
}
