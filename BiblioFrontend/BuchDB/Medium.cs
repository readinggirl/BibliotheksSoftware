using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BuchDB {
    public class Medium {
        public int Id { get; set; }
        public Medienart Medienart { get; set; }
        public long ISBN { get; set; }
        public string Systematik { get; set; }
        public string Sachtitel { get; set; }
        public string? Titelzusatz { get; set; }
        public string? Nebeneintragung { get; set; }
        public string? Reihentitel { get; set; }
        public string? Fussnote { get; set; }
        public string? BandAuffuehrung { get; set; }
        public string? Verweis { get; set; }
        public int VerlagsID { get; set; }
        public int Erscheinungsjahr { get; set; }
        public string? Ausgabe { get; set; }
        public string? Umfang { get; set; }
        public string? Sprache { get; set; }
        public string? Illustrationsvermerk { get; set; }
        public string? Beigaben { get; set; }
        public long? ISBN10 { get; set; }
        public long? ISBN13 { get; set; }
        public string ArtDerBindung { get; set; }
        public Ausleihstatus eAusleihstatus { get; set; }
        public string? Anmerkungen { get; set; }
        public string? ZusaetzlicheInfos { get; set; }
        public string Titelbild { get; set; }
        public DateTime InventurDatum { get; set; }
        public DateTime Aenderungsdatum { get; set; }
    }
}
