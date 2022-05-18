using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BuchDB
{
    internal class BuchContext : DbContext
    {
        public const string dbPath = "D:\\Temp\\BuchDb.mdf";
        public string connectionString = "";

        public BuchContext(DbContextOptions<BuchContext> options) : base(options) { }

        protected BuchContext()
        {
        }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            connectionString = $"Server=(LocalDB)\\mssqllocaldb;attachdbfilename={dbPath}; integrated security = True; MultipleActiveResultSets=True";
            Console.WriteLine($"connectionString: {connectionString}");
            optionsBuilder.UseSqlServer(connectionString);
        }
        public DbSet<Benutzer> Benutzers { get; set; }
        public DbSet<Medium> Mediums { get; set; }
        public DbSet<Ort> Orts { get; set; }
        public DbSet<Ausleihstatus> EAusleihstatuses { get; set; }
        public DbSet<Benutzergruppe> Benutzergruppes { get; set; }
        public DbSet<Gebuehrengruppe> Gebuehrengruppes{ get; set; }
        public DbSet<Medienart> Medienarts{ get; set; }
        public DbSet<Recht> Rechts { get; set; }

    }
}
