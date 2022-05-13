using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BuchDB
{
    internal class Ort
    {
        public int Id { get; set; }
        public int PLZ { get; set; }
        string Name { get; set; }

        public virtual ICollection<Benutzer> Benutzers { get; set; }
    }
}
