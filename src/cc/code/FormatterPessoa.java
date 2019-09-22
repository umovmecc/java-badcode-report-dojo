package cc.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class FormatterPessoa {
    public String format(Vector<Pessoa> paramL) {
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < paramL.size(); i++) {
            Pessoa p = (Pessoa) paramL.get(i);
            list.add(p.getName());
        }

        return String.join(", ", list);
    }
}
