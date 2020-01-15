/*
Дан класс ComplexNumber. Переопределите в нем методы equals() и hashCode() так, чтобы equals() сравнивал
экземпляры ComplexNumber по содержимому полей re и im, а hashCode() был бы согласованным с реализацией equals().

Реализация hashCode(), возвращающая константу или не учитывающая дробную часть re и im, засчитана не будет
 */

public class Class_Object_step9 {  // rename class to ComplexNumber
    private final Double re;
    private final Double im;

    public Class_Object_step9(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public Double getRe() {
        return re;
    }
    public Double getIm() {
        return im;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + re.hashCode();
        result = prime * result + im.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Class_Object_step9 other = (Class_Object_step9) obj;
        return ((re.equals(other.re) && re != null) || re == other.re)
                && ((im.equals(other.im) && im != null) || im == other.im);
    }
}

