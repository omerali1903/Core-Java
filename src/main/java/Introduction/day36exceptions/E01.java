package Introduction.day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    1)Run Button'una bastiktan sonra console'da alinan Exception'lara "Runtime Exception" denir.
     ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException
     "Runtime Exception"a ornektir.
     "Runtime Exception" lara "Unchecked Exception" da denir.

    2)Code yazarken kirmizi alt cizgi seklinde alinan Exception'lar da vardir, bunlara "Compile Time Exception" denir.
     FileNotFoundException, IOException "Compile Time Exception" a ornektir.
     "Compile Time Exception" lara "Checked Exception" da denir.

    3)FileNotFoundException: Java'ya bir dosyayi bul dedigimizde, Java "dosyanin adresi" ve "dosyanin varligi" konusunda
                             hata olusursa ne yapmasi gerektigini soylememizi ister

    4)IOException: "IO" Input Output demektir.
                    Note: IOException, FileNotFoundException'in parent'idir.

    5)Java da hatalar temelde 2 ye ayrilir.
        i) Exception' lar   ii) Error'lar:  a)StackOverflow Error(Stack Memory'nin dolmasi halinde olusur)   b)Out Of Memory Error(Heap Memory'nin dolmasi halinde olusur)
                                            c)Virtual Machine Error( JVM (Java Sanal Makinesi) nin arizalanmasi halinde olusur)

                                            Compile Time Exception:

1)FileNotFoundException(Dosya bulunamadi hatasi)
Javadan bir dosyayi bulmasini istediginizde java dosyanin adresi ve dosyanin varligi konusunda hata olusursa
ne yapmasi gerektigini de soylemenizi ister.
Ona ne yapmasini soylersek ayrica javayi bu dosyanin silinmedigi konusunda rahatlatmamiz gerekir.

2)IOException(Input-Output)
Bu exception input ve output ile ilgili tum problemleri handle edebilir. Application'imiza data girdisi yaptigimizda veya data ciktisi yapabiliriz. Dosyanin bulunmasi halinde oradaki datayi kullanabiliriz. Oyleyse dosyanin bulunmasi input ile alakali bir operasyondur. IOException bu nedenle FileNotFoundException'in parent'idir. Genel olan spesifik olanin parent'i olur. Bu durumda parent catch block'da ona gore sirasini alir.
Coklu catch block yapmazsak, o zaman sadece IOExeption'i kullaniriz.
 */
public class E01 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/main/java/Introduction/day36exceptions/TextFile");

        int i = 0 ;

        while ((i=fis. read())!=-1){
            System.out.print((char) i);

        }

    }


}
