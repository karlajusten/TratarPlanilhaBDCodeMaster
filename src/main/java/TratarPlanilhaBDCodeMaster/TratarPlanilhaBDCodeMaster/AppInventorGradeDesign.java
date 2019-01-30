package TratarPlanilhaBDCodeMaster.TratarPlanilhaBDCodeMaster;

import TratarPlanilhaBDCodeMaster.TratarPlanilhaBDCodeMaster.Grade;

/*
 * @author Karla Aparecida Justen <karlapm2@gmail.com>
 */
public class AppInventorGradeDesign extends Grade {
	
	//variaveis criadas em conjunto por critério;
	private Integer dimensionamentoResponsivo;
	private Integer familiaFonte, qtdFontTypeface, qtdSansSerif; // criterio Familia Fonte
	private Integer tamanhoFonteBotoes, qtdBotaoComTexto, qtdFontBotaoTamanho16; // criterio Tamanho Fonte Botoes
	private Integer capitalizacaoSentenca, qtdSentenca, qtdSentencaComCapitalizacaoCorreta; // criterio Capitalização de sentenças
	private Integer caixaAltaBotao, qtdBotaoComTodoTextoCaixaAlta; // + qtdBotaoComTexto;  criterio Capitalização de botões
	private Integer tamanhoFonteComp, qtdComponentesTamFont, qtdComponentesTamFontRespeitaRegra; // criterio Tamanho de fonte de componentes
 	private Integer textoDefault, qtdComponentesComTexto, qtdCompComTextoIgualPadrao; // criterio componente texto diferente do padrão
 	private Integer doisPontosLegenda, qtdLegenda, qtdLegendaSemDoisPontos; // criterio Lgendas com ":" ao final
 	private Integer pontoFinalSentenca, qtdSentencaSemPontoFinal; //critério Não usa ponto final para encerrar sentenças
 	private Integer telasComOrganizadores, qtdTelas, qtdTelasComOrganizadores; // Criterio de quantas telas tem pelo menos um organizador;
 	private Integer dicaPreenchidaEDiferenteDefault, qtdComponentesComDica, qtdCompComDicaIgualPadraoOuVazio; // Criterio Componentes com propriedade Dica preenchida e diferente de default
 	private Integer sistemaDeCores, qtdCores; // Sistema de Cores
 	private Integer tamanhoFonteSenhaCaixaTextoPintura, qtdSenhaCaixaTextoPinturaTamFont, qtdSenhaCaixaTextoPinturaTamFontRespeitaRegra; //Tamanho da fonte dos componentes CaixaDeSenha, CaixaDeTexto e Pintura (Canvas)
 	private Integer contrasteEntreTextoFundoNaoNegrito; //Contraste entre texto e fundo Nao Negrito
 	private Integer contrasteEntreTextoFundoNegrito; //Contraste entre texto e fundo Negrito
 	private String tema; //Contraste
 	private Integer alturaComponenteAlvoToque, larguraComponenteAlvoToque;
	// Ícones do Material Design
	private Integer iconesMD;
	private Integer qtdTotalIcones, qtdIconesDoMD;
	// Imagens de fundo de tela
	private Integer imagensDeFundo;
	private Integer qtdTelasIrrestritaGrave;
	private Integer qtdTelasRestritaGrave;
	private Integer qtdTelasIrrestrita;
	private Integer qtdTelasRestritaLeve;
	// Componente Imagem
	private Integer componenteImagem;
	private Integer qtdComponentesImagem;
	private Integer qtdImagensSemRedimensionar;
	// Imagens em botões
	private Integer imagensEmBotoes;
	private Integer qtdBotoesComImagem;
	private Integer qtdBotoesComImagemSemDistorcao;
	// Pixelização
	private Integer pixelizacao;
	private Integer qtdTelasComFundo;
	private Integer qtdTelasComFundoSemPixelizacao;
	//private Integer qtdComponentesImagem;
	private Integer qtdComponentesImagemSemPixelizacao;
	//private Integer qtdBotoesComImagem;
	private Integer qtdBotoesComImagemSemPixelizacao;
 	
	private Integer totalInterUsuario;
	private Integer maxInterUsuario;
	private Double notaInterUsuario;
	 
	public AppInventorGradeDesign() {
	    this.dimensionamentoResponsivo = null;
	    this.familiaFonte = null;
	    this.tamanhoFonteBotoes = null;
	    this.caixaAltaBotao = null;
	    this.tamanhoFonteComp = null;
	    this.textoDefault = null;
	    this.doisPontosLegenda = null;
	    this.pontoFinalSentenca = null;
	    this.capitalizacaoSentenca = null;
	    this.contrasteEntreTextoFundoNaoNegrito = null;
	    this.contrasteEntreTextoFundoNegrito = null;
	    this.tema = null;
	    this.alturaComponenteAlvoToque = null;
	    this.larguraComponenteAlvoToque = null;
	    
	    this.iconesMD = null;
	    this.qtdTotalIcones = null;
	    this.qtdIconesDoMD = null;
	    this.imagensDeFundo = null;
	    this.qtdTelasIrrestritaGrave = null;
	    this.qtdTelasRestritaGrave = null;
	    this.qtdTelasIrrestrita = null;
	    this.qtdTelasRestritaLeve = null;
	    this.componenteImagem = null;
	    this.qtdComponentesImagem = null;
	    this.qtdImagensSemRedimensionar = null;
	    this.imagensEmBotoes = null;
	    this.qtdBotoesComImagem = null;
	    this.qtdBotoesComImagemSemDistorcao = null;
	    this.pixelizacao = null;
	    this.qtdTelasComFundo = null;
	    this.qtdTelasComFundoSemPixelizacao = null;
	    this.qtdComponentesImagemSemPixelizacao = null;
	    this.qtdBotoesComImagemSemPixelizacao = null;
	 	
	    this.totalInterUsuario = null;
		this.maxInterUsuario = null;
	    this.notaInterUsuario = null;
		
	}
	
	public Integer getDimensionamentoResponsivo() {
        return dimensionamentoResponsivo;
    }
    
    public void setDimensionamentoResponsivo(Integer dimensionamentoResponsivo) {
        this.dimensionamentoResponsivo = dimensionamentoResponsivo;
    }
    
    public int getFamiliaFonte() {
        return familiaFonte;
    }
    
    public void setFamiliaFonte(int familiaFonte) {
        this.familiaFonte = familiaFonte;
    }
    
    public int getQtdFontTypeface() {
        return qtdFontTypeface;
    }
    public void setQtdFontTypeface(int qtdFontTypeface) {
        this.qtdFontTypeface = qtdFontTypeface;
    }
    
    public int getQtdSansSerif() {
        return qtdSansSerif;
    }
    
    public void setQtdSansSerif(int qtdSansSerif) {
        this.qtdSansSerif = qtdSansSerif;
    }
    
    public int getTamanhoFonteBotoes() {
        return tamanhoFonteBotoes;
    }
    
    public void setTamanhoFonteBotoes(int tamanhoFonteBotoes) {
        this.tamanhoFonteBotoes = tamanhoFonteBotoes;
    }

    public int getQtdBotaoComTexto(){
		return qtdBotaoComTexto;
	}
	
	public void setQtdBotaoComTexto(int qtdBotaoComTexto){
		this.qtdBotaoComTexto = qtdBotaoComTexto;
	}
	
	public int getQtdFontBotaoTamanho16(){
		return qtdFontBotaoTamanho16;
	}
	
	public void setQtdFontBotaoTamanho16(int qtdFontBotaoTamanho16){
		this.qtdFontBotaoTamanho16 = qtdFontBotaoTamanho16;
	}

    public Integer getCapitalizacaoSentenca() {
        return capitalizacaoSentenca;
    }
    
    public void setCapitalizacaoSentenca(Integer capitalizacaoSentenca) {
        this.capitalizacaoSentenca = capitalizacaoSentenca;
    }
    
    public int getQtdSentenca(){
		return qtdSentenca;
	}
	
	public void setQtdSentenca(int qtdSentenca){
		this.qtdSentenca = qtdSentenca;
	}
	
	public int getQtdSentencaComCapitalizacaoCorreta(){
		return qtdSentencaComCapitalizacaoCorreta;
	}
	
	public void setQtdSentencaComCapitalizacaoCorreta(int qtdSentencaComCapitalizacaoCorreta){
		this.qtdSentencaComCapitalizacaoCorreta = qtdSentencaComCapitalizacaoCorreta;
	}
    
    public int getCaixaAltaBotao() {
        return caixaAltaBotao;
    }
    
    public void setCaixaAltaBotao(int caixaAltaBotao) {
        this.caixaAltaBotao = caixaAltaBotao;
    }
    
	public int getQtdBotaoComTodoTextoCaixaAlta(){
		return qtdBotaoComTodoTextoCaixaAlta;
	}
	
	public void setQtdBotaoComTodoTextoCaixaAlta(int qtdBotaoComTodoTextoCaixaAlta){
		this.qtdBotaoComTodoTextoCaixaAlta = qtdBotaoComTodoTextoCaixaAlta;
	}
    
    public int getTamanhoFonteComp() {
        return tamanhoFonteComp;
    }
    
    public void setTamanhoFonteComp(int tamanhoFonteComp) {
        this.tamanhoFonteComp = tamanhoFonteComp;
    }
    
    public int getQtdComponentesTamFont(){
		return qtdComponentesTamFont; 
	}
	
	public void setQtdComponentesTamFont(int qtdComponentesTamFont){
		this.qtdComponentesTamFont = qtdComponentesTamFont;
	}
	
	public int getQtdComponentesTamFontRespeitaRegra(){
    	return qtdComponentesTamFontRespeitaRegra;
    }
	
    public void setQtdComponentesTamFontRespeitaRegra(int qtdComponentesTamFontRespeitaRegra){
    	this.qtdComponentesTamFontRespeitaRegra = qtdComponentesTamFontRespeitaRegra;
    }
	
	public int getIconesMD() {
		return iconesMD;
	}
	public void setIconesMD(int iconesMD) {
		this.iconesMD = iconesMD;
	}
	public int getQtdTotalIcones() {
		return qtdTotalIcones;
	}
	public void setQtdTotalIcones(int qtdTotalIcones) {
		this.qtdTotalIcones = qtdTotalIcones;
	}
	public int getQtdIconesDoMD() {
		return qtdIconesDoMD;
	}
	public void setQtdIconesDoMD(int qtdIconesDoMD) {
		this.qtdIconesDoMD = qtdIconesDoMD;
	}
	
	public int getImagensDeFundo() {
		return imagensDeFundo;
	}
	public void setImagensDeFundo(int imagensDeFundo) {
		this.imagensDeFundo = imagensDeFundo;
	}
	public int getQtdTelasIrrestritaGrave() {
		return qtdTelasIrrestritaGrave;
	}
	public void setQtdTelasIrrestritaGrave(int qtdTelasIrrestritaGrave) {
		this.qtdTelasIrrestritaGrave = qtdTelasIrrestritaGrave;
	}
	public int getQtdTelasRestritaGrave() {
		return qtdTelasRestritaGrave;
	}
	public void setQtdTelasRestritaGrave(int qtdTelasRestritaGrave) {
		this.qtdTelasRestritaGrave = qtdTelasRestritaGrave;
	}
	public int getQtdTelasIrrestrita() {
		return qtdTelasIrrestrita;
	}
	public void setQtdTelasIrrestrita(int qtdTelasIrrestrita) {
		this.qtdTelasIrrestrita = qtdTelasIrrestrita;
	}
	public int getQtdTelasRestritaLeve() {
		return qtdTelasRestritaLeve;
	}
	public void setQtdTelasRestritaLeve(int qtdTelasRestritaLeve) {
		this.qtdTelasRestritaLeve = qtdTelasRestritaLeve;
	}
	
	public int getComponenteImagem() {
		return componenteImagem;
	}
	public void setComponenteImagem(int componenteImagem) {
		this.componenteImagem = componenteImagem;
	}
	public int getQtdComponentesImagem() {
		return qtdComponentesImagem;
	}
	public void setQtdComponentesImagem(int qtdComponentesImagem) {
		this.qtdComponentesImagem = qtdComponentesImagem;
	}
	public int getQtdImagensSemRedimensionar() {
		return qtdImagensSemRedimensionar;
	}
	public void setQtdImagensSemRedimensionar(int qtdImagensSemRedimensionar) {
		this.qtdImagensSemRedimensionar = qtdImagensSemRedimensionar;
	}
	
	public int getImagensEmBotoes() {
		return imagensEmBotoes;
	}
	public void setImagensEmBotoes(int imagensEmBotoes) {
		this.imagensEmBotoes = imagensEmBotoes;
	}
	public int getQtdBotoesComImagem() {
		return qtdBotoesComImagem;
	}
	public void setQtdBotoesComImagem(int qtdBotoesComImagem) {
		this.qtdBotoesComImagem = qtdBotoesComImagem;
	}
	public int getQtdBotoesComImagemSemDistorcao() {
		return qtdBotoesComImagemSemDistorcao;
	}
	public void setQtdBotoesComImagemSemDistorcao(int qtdBotoesComImagemSemDistorcao) {
		this.qtdBotoesComImagemSemDistorcao = qtdBotoesComImagemSemDistorcao;
	}
	
	public Integer getPixelizacao()
	{
		return pixelizacao;
	}
	public void setPixelizacao(Integer pixelizacao)
	{
		this.pixelizacao = pixelizacao;
	}
	public Integer getQtdTelasComFundo()
	{
		return qtdTelasComFundo;
	}
	public void setQtdTelasComFundo(Integer qtdTelasComFundo)
	{
		this.qtdTelasComFundo = qtdTelasComFundo;
	}
	public Integer getQtdTelasComFundoSemPixelizacao()
	{
		return qtdTelasComFundoSemPixelizacao;
	}
	public void setQtdTelasComFundoSemPixelizacao(Integer qtdTelasComFundoSemPixelizacao)
	{
		this.qtdTelasComFundoSemPixelizacao = qtdTelasComFundoSemPixelizacao;
	}
	
	public Integer getQtdComponentesImagemSemPixelizacao()
	{
		return qtdComponentesImagemSemPixelizacao;
	}
	public void setQtdComponentesImagemSemPixelizacao(Integer qtdComponentesImagemSemPixelizacao)
	{
		this.qtdComponentesImagemSemPixelizacao = qtdComponentesImagemSemPixelizacao;
	}
	
	public Integer getQtdBotoesComImagemSemPixelizacao()
	{
		return qtdBotoesComImagemSemPixelizacao;
	}
	public void setQtdBotoesComImagemSemPixelizacao(Integer qtdBotoesComImagemSemPixelizacao)
	{
		this.qtdBotoesComImagemSemPixelizacao = qtdBotoesComImagemSemPixelizacao;
	}
	
	public Double getNotaInterUsuario() {
		return notaInterUsuario;
	}
	
	public void setNotaInterUsuario(Double notaInterUsuario) {
		this.notaInterUsuario = notaInterUsuario;
	}
	
	public Integer getTotalInterUsuario(){
	    return totalInterUsuario;
	}
	
	public void setTotalInterUsuario(Integer total) {
	    this.totalInterUsuario = total;
	}

	public Integer getTextoDefault(){
	    return textoDefault;
	}
	
	public void setTextoDefault(Integer textoDefault) {
	    this.textoDefault = textoDefault;
	}
	
	public int getQtdComponentesComTexto(){
    	return qtdComponentesComTexto;
    }
    
    public void setQtdComponentesComTexto(int qtdComponentesComTexto){
    	this.qtdComponentesComTexto = qtdComponentesComTexto;
    }
    
    public int getQtdCompComTextoIgualPadrao(){
    	return qtdCompComTextoIgualPadrao;
    }
    
    public void setQtdCompComTextoIgualPadrao(int qtdCompComTextoIgualPadrao){
    	this.qtdCompComTextoIgualPadrao = qtdCompComTextoIgualPadrao;
    }
	
	public Integer getDoisPontosLegenda(){
		return doisPontosLegenda;
	}
	
	public void setDoisPontosLegenda(Integer doisPontosLegenda){
		this.doisPontosLegenda = doisPontosLegenda;
	}
	
	public int getQtdLegenda(){
    	return qtdLegenda;
    }
    
    public void setQtdLegenda(int qtdLegenda){
    	this.qtdLegenda = qtdLegenda;
    }
    
    public int getQtdLegendaSemDoisPontos(){
    	return qtdLegendaSemDoisPontos;
    }
    public void setQtdLegendaSemDoisPontos(int qtdLegendaSemDoisPontos){
    	this.qtdLegendaSemDoisPontos = qtdLegendaSemDoisPontos;
    }

	public Integer getPontoFinalSentenca(){
		return pontoFinalSentenca;
	}
	
	public void setPontoFinalSentenca(Integer pontoFinalSentenca){
		this.pontoFinalSentenca = pontoFinalSentenca;
	}

    public int getQtdSentencaSemPontoFinal(){
    	return qtdSentencaSemPontoFinal;
    }
    
    public void setQtdSentencaSemPontoFinal(int qtdSentencaSemPontoFinal){
    	this.qtdSentencaSemPontoFinal = qtdSentencaSemPontoFinal;
    }
    
    public int getTelasComOrganizadores() {
        return telasComOrganizadores;
    }
    
    public void setTelasComOrganizadores(Integer telasComOrganizadores) {
        this.telasComOrganizadores = telasComOrganizadores;
    }
    
    public int getQtdTelas(){
    	return qtdTelas;
    }
    public void setQtdTelas(int qtdTelas){
    	this.qtdTelas = qtdTelas;
    }
    
    public int getQtdTelasComOrganizadores(){
    	return qtdTelasComOrganizadores;
    }
    
    public void setQtdTelasComOrganizadores(int qtdTelasComOrganizadores){
    	this.qtdTelasComOrganizadores = qtdTelasComOrganizadores;
    }
    
    public int getDicaPreenchidaEDiferenteDefault(){
    	return dicaPreenchidaEDiferenteDefault;
    }
    
    public void setDicaPreenchidaEDiferenteDefault(Integer dicaPreenchidaEDiferenteDefault){
    	this.dicaPreenchidaEDiferenteDefault = dicaPreenchidaEDiferenteDefault;
    }
    
    public int getQtdComponentesComDica(){
    	return qtdComponentesComDica;
    }
    
    public void setQtdComponentesComDica(int qtdComponentesComDica){
    	this.qtdComponentesComDica = qtdComponentesComDica;
    }
    
    public int getQtdCompComDicaIgualPadraoOuVazio(){
    	return qtdCompComDicaIgualPadraoOuVazio;
    }
    
    public void setQtdCompComDicaIgualPadraoOuVazio(int qtdCompComDicaIgualPadraoOuVazio){
    	this.qtdCompComDicaIgualPadraoOuVazio = qtdCompComDicaIgualPadraoOuVazio;
    }
    
    public int getSistemaDeCores(){
    	return sistemaDeCores;
    }
    
    public void setSistemaDeCores(int sistemaDeCores){
    	this.sistemaDeCores = sistemaDeCores;
    }
    
    public int getQtdCores(){
    	return qtdCores;
    }
    
    public void setQtdCores(int qtdCores){
    	this.qtdCores = qtdCores;
    }

	public Integer getTamanhoFonteSenhaCaixaTextoPintura() {
		return tamanhoFonteSenhaCaixaTextoPintura;
	}

	public void setTamanhoFonteSenhaCaixaTextoPintura(Integer tamanhoFonteSenhaCaixaTextoPintura) {
		this.tamanhoFonteSenhaCaixaTextoPintura = tamanhoFonteSenhaCaixaTextoPintura;
	}

	public Integer getQtdSenhaCaixaTextoPinturaTamFont() {
		return qtdSenhaCaixaTextoPinturaTamFont;
	}

	public void setQtdSenhaCaixaTextoPinturaTamFont(Integer qtdSenhaCaixaTextoPinturaTamFont) {
		this.qtdSenhaCaixaTextoPinturaTamFont = qtdSenhaCaixaTextoPinturaTamFont;
	}

	public Integer getQtdSenhaCaixaTextoPinturaTamFontRespeitaRegra() {
		return qtdSenhaCaixaTextoPinturaTamFontRespeitaRegra;
	}

	public void setQtdSenhaCaixaTextoPinturaTamFontRespeitaRegra(
			Integer qtdSenhaCaixaTextoPinturaTamFontRespeitaRegra) {
		this.qtdSenhaCaixaTextoPinturaTamFontRespeitaRegra = qtdSenhaCaixaTextoPinturaTamFontRespeitaRegra;
	}

	public Integer getContrasteEntreTextoFundoNaoNegrito() {
		return contrasteEntreTextoFundoNaoNegrito;
	}

	public void setContrasteEntreTextoFundoNaoNegrito(Integer contrasteEntreTextoFundo) {
		this.contrasteEntreTextoFundoNaoNegrito = contrasteEntreTextoFundo;
	}

	public Integer getContrasteEntreTextoFundoNegrito() {
		return contrasteEntreTextoFundoNegrito;
	}

	public void setContrasteEntreTextoFundoNegrito(Integer contrasteEntreTextoFundoNegrito) {
		this.contrasteEntreTextoFundoNegrito = contrasteEntreTextoFundoNegrito;
	}
	
	public String getTema() {
		return this.tema;
	}
	
	public void setTema(String temaApp) {
		this.tema = temaApp;
	}
	
	public Integer getAlturaComponenteAlvoToque() {
		return alturaComponenteAlvoToque;
	}

	public void setAlturaComponenteAlvoToque(Integer alturaComponenteAlvoToque) {
		this.alturaComponenteAlvoToque = alturaComponenteAlvoToque;
	}

	public Integer getLarguraComponenteAlvoToque() {
		return larguraComponenteAlvoToque;
	}

	public void setLarguraComponenteAlvoToque(Integer larguraComponenteAlvoToque) {
		this.larguraComponenteAlvoToque = larguraComponenteAlvoToque;
	}
	
	public int getMaxInterUsuario()
	{
		return maxInterUsuario;
	}
	public void setMaxInterUsuario(int maxInterUsuario)
	{
		this.maxInterUsuario = maxInterUsuario;
	}
}
