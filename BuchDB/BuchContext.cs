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
        public BuchContext(DbContextOptions options) : base(options)
        {
        }

        protected BuchContext()
        {
            connectionString = $"Server=(LocalDB)\\mssqllocaldb;attachdbfilename={dbPath}; integrated security = True; MultipleActiveResultSets=True";
        }
    }
}
