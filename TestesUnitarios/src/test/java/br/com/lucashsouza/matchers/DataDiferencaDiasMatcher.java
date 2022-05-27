package br.com.lucashsouza.matchers;

import br.com.lucashsouza.utils.DataUtils;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DataDiferencaDiasMatcher extends TypeSafeMatcher<Date> {

    private Integer quantidadeDias;

    public DataDiferencaDiasMatcher(Integer quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    @Override
    public void describeTo(Description description) {
        Date dataEsperada = DataUtils.obterDataComDiferencaDias(quantidadeDias);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        description.appendText(sdf.format(dataEsperada));
    }

    @Override
    protected boolean matchesSafely(Date data) {
        Date amanha = DataUtils.obterDataComDiferencaDias(quantidadeDias);
        return DataUtils.isMesmaData(data, amanha);
    }
}
