namespace BuchDB;
public class Benutzer {
    public int Id { get; set; }
    public string? Titel { get; set; }
    public string Familienname { get; set; }
    public string Vorname { get; set; }
    public Benutzergruppe Benutzergruppe { get; set; }
    public Gebuehrengruppe Gebuehrengruppe { get; set; }
    public string? Telefon { get; set; }
    public string? Mobiltelefon { get; set; }
    public DateOnly GebDatum { get; set; }
    public string? MailAdresse { get; set; }
    public string? Strasse { get; set; }
    public int? HausNr { get; set; }
    public int? OrtId { get; set; }
    public double? AktuellerKontostand { get; set; }
    public List<Recht> WebsiteRechte { get; set; }
    public List<Medium>? Medien { get; set; }
    public string? LoginUser { get; set; }
    public string? LoginPassword { get; set; }

}
