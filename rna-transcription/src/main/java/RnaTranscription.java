import java.util.HashMap;
import java.util.Map;

class RnaTranscription {
    public String transcribe(String dnaSequence) {
        Map<Character, Character> dnaToRnaMap = createDNAToRNAMap();
        StringBuilder rnaSequence = new StringBuilder();

        for (char nucleotide : dnaSequence.toCharArray()) {
            // Map each DNA nucleotide to its RNA counterpart
            char rnaNucleotide = dnaToRnaMap.get(nucleotide);
            rnaSequence.append(rnaNucleotide);
        }
        return rnaSequence.toString();
    }

    private static Map<Character, Character> createDNAToRNAMap() {
        Map<Character, Character> dnaToRnaMap = new HashMap<>();
        dnaToRnaMap.put('A', 'U');
        dnaToRnaMap.put('C', 'G');
        dnaToRnaMap.put('G', 'C');
        dnaToRnaMap.put('T', 'A');
        return dnaToRnaMap;
    }


//    Map<String, String> rnaMap;
//    RnaTranscription(){
//        rnaMap = new HashMap<>();
//        rnaMap.put("G", "C");
//        rnaMap.put("C", "G");
//        rnaMap.put("T", "A");
//        rnaMap.put("A", "U");
//    }
//
//    String transcribe(String dnaStrand) {
//        if (dnaStrand.isEmpty()){
//            return "";
//        }
//        String s = "";
//        for (int i =0;i<dnaStrand.length();i++){
//            s += rnaMap.get(dnaStrand[i]);
//        }
//        return rnaMap.get(dnaStrand);
//    }

}
