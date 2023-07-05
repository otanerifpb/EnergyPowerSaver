# EnergyPowerSaver

## Informações Adicionais

**Classe abstrata Equipamento**: contém métodos para ligar e desligar os equipamentos.


&nbsp; 
**Classes específicas**: ArCondicionado e Luz. 


&nbsp;
**Classe BlocoAcademico**: contém uma lista de equipamentos e atualiza os métodos ligarEquipamentos e desligarEquipamentos para ligar/desligar todos os equipamentos do bloco. Implementa a interface Observer.


&nbsp;
**Classe Docente**: representa um docente, implementa a interface Observer para notificar o bloco acadêmico sobre sua entrada ou saída.


&nbsp;
**Classe Main**: adiciona e testa os equipamentos no bloco, bem como testa o fluxo dos docentes no bloco acadêmico.


&nbsp;
**Interface Monitore**: é a interface que define três métodos que permitem adicionar/remover um observador e notificar os observadores sobre a entrada ou saída de um docente no bloco acadêmico.


&nbsp;
**Interface Observer**: é a interface que define o método update(boolean) para que as classes que desejam ser observadoras sejam notificadas sobre as mudanças.


&nbsp;
No diagrama de classe a seta entre BlocoAcademico e Equipamento indica que aquele possui uma lista de equipamentos. Essa lista permite ao BlocoAcademico adicionar equipamentos específicos (como ArCondicionado ou Luz), bem como controlar o estado desses equipamentos (ligado/desligado).

Cada equipamento (ArCondicionado e Luz) herda da classe abstrata Equipamento, sendo assim, possui os métodos definidos na classe abstrata, como ligar(), desligar() e getNome(). Cada equipamento também pode fornecer seu próprio nome específico, implementando o método getNome().
