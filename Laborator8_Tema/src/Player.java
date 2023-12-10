public class Player implements Comparable <Player> {

    String first;
    String last;

    String team;

    Integer year;

    Integer games_played;

    String min;

    Float fgm;

    Float fga;

    Float fg3m;

    Float fg3a;
    Float ftm;

    Float fta;

    Float oreb;

    Float dreb;

    Float reb;

    Float ast;

    Float stl;

    Float blk;

    Float turnover;

    Float pf;

    Float pts;

    Float fg_pct;

    Float fg3_pct;

    Float ft_pct;

    public Player(String first, String last, String team, Integer year, Integer games_played, String min, Float fgm, Float fga, Float fg3m, Float fg3a, Float ftm, Float fta, Float oreb, Float dreb, Float reb, Float ast, Float stl, Float blk, Float turnover, Float pf, Float pts, Float fg_pct, Float fg3_pct, Float ft_pct) {
        this.first = first;
        this.last = last;
        this.team = team;
        this.year = year;
        this.games_played = games_played;
        this.min = min;
        this.fgm = fgm;
        this.fga = fga;
        this.fg3m = fg3m;
        this.fg3a = fg3a;
        this.ftm = ftm;
        this.fta = fta;
        this.oreb = oreb;
        this.dreb = dreb;
        this.reb = reb;
        this.ast = ast;
        this.stl = stl;
        this.blk = blk;
        this.turnover = turnover;
        this.pf = pf;
        this.pts = pts;
        this.fg_pct = fg_pct;
        this.fg3_pct = fg3_pct;
        this.ft_pct = ft_pct;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getGames_played() {
        return games_played;
    }

    public void setGames_played(Integer games_played) {
        this.games_played = games_played;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public Float getFgm() {
        return fgm;
    }

    public void setFgm(Float fgm) {
        this.fgm = fgm;
    }

    public Float getFga() {
        return fga;
    }

    public void setFga(Float fga) {
        this.fga = fga;
    }

    public Float getFg3m() {
        return fg3m;
    }

    public void setFg3m(Float fg3m) {
        this.fg3m = fg3m;
    }

    public Float getFg3a() {
        return fg3a;
    }

    public void setFg3a(Float fg3a) {
        this.fg3a = fg3a;
    }

    public Float getFtm() {
        return ftm;
    }

    public void setFtm(Float ftm) {
        this.ftm = ftm;
    }

    public Float getFta() {
        return fta;
    }

    public void setFta(Float fta) {
        this.fta = fta;
    }

    public Float getOreb() {
        return oreb;
    }

    public void setOreb(Float oreb) {
        this.oreb = oreb;
    }

    public Float getDreb() {
        return dreb;
    }

    public void setDreb(Float dreb) {
        this.dreb = dreb;
    }

    public Float getReb() {
        return reb;
    }

    public void setReb(Float reb) {
        this.reb = reb;
    }

    public Float getAst() {
        return ast;
    }

    public void setAst(Float ast) {
        this.ast = ast;
    }

    public Float getStl() {
        return stl;
    }

    public void setStl(Float stl) {
        this.stl = stl;
    }

    public Float getBlk() {
        return blk;
    }

    public void setBlk(Float blk) {
        this.blk = blk;
    }

    public Float getTurnover() {
        return turnover;
    }

    public void setTurnover(Float turnover) {
        this.turnover = turnover;
    }

    public Float getPf() {
        return pf;
    }

    public void setPf(Float pf) {
        this.pf = pf;
    }

    public Float getPts() {
        return pts;
    }

    public void setPts(Float pts) {
        this.pts = pts;
    }

    public Float getFg_pct() {
        return fg_pct;
    }

    public void setFg_pct(Float fg_pct) {
        this.fg_pct = fg_pct;
    }

    public Float getFg3_pct() {
        return fg3_pct;
    }

    public void setFg3_pct(Float fg3_pct) {
        this.fg3_pct = fg3_pct;
    }

    public Float getFt_pct() {
        return ft_pct;
    }

    public void setFt_pct(Float ft_pct) {
        this.ft_pct = ft_pct;
    }

    @Override
    public String toString() {
        return "Player{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", team='" + team + '\'' +
                ", year=" + year +
                ", games_played=" + games_played +
                ", min='" + min + '\'' +
                ", fgm=" + fgm +
                ", fga=" + fga +
                ", fg3m=" + fg3m +
                ", fg3a=" + fg3a +
                ", ftm=" + ftm +
                ", fta=" + fta +
                ", oreb=" + oreb +
                ", dreb=" + dreb +
                ", reb=" + reb +
                ", ast=" + ast +
                ", stl=" + stl +
                ", blk=" + blk +
                ", turnover=" + turnover +
                ", pf=" + pf +
                ", pts=" + pts +
                ", fg_pct=" + fg_pct +
                ", fg3_pct=" + fg3_pct +
                ", ft_pct=" + ft_pct +
                '}';
    }

    public int compareTo(Player otherPlayer) {
        return this.games_played.compareTo(otherPlayer.getGames_played());
    }
}
