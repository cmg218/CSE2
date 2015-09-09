// Christine Gelotte
//September 8, 2015
// CSE2, Homework 2, Arithmetic Calculations
//This program calculates the cost of various goods at walmart

// Define a class
public class Arithmetic {
    //main method
    public static void main(String[] args){
        //Assumptions (input variables)
        int nSocks=3;//Number of pairs of socks
        double sockCost=2.58;//Cost per pair of socks
        int nGlasses=6;//number of drinking glasses
        double glassCost=2.29;//Cost per glass
        int nEnvelopes=1;//number of boxes of envelopes
        double envelopeCost=3.25;//cost per box of envelopes
        double taxPercent=0.06;// PA sales tax(6%)
        //Total cost of each kind of item (before tax)
        double preTaxSockTotal=nSocks*sockCost;//total cost of socks before tax
        double preTaxGlassTotal=nGlasses*glassCost;//total cost of glasses before tax
        double preTaxEnvelopeTotal=nEnvelopes*envelopeCost;//total cost of envelope boxes before tax
        // Sales tax for each kind of item
        double taxAmountSock=preTaxSockTotal*taxPercent;//sales tax for sock purchase
        double taxAmountGlass=preTaxGlassTotal*taxPercent;//sales tax for glass purchase
        double taxAmountEnvelope=preTaxEnvelopeTotal*taxPercent;//sales tax for Envelope purchase
        taxAmountSock=taxAmountSock*100;//reducing number of digits left of decimal to 2 for sock sales tax
        taxAmountSock=(int)taxAmountSock;
        taxAmountSock=taxAmountSock/100.0;
        taxAmountGlass=taxAmountGlass*100;//reducing number of digits left of decimal to 2 for glass sales tax
        taxAmountGlass=(int)taxAmountGlass;
        taxAmountGlass=taxAmountGlass/100.0;
        taxAmountEnvelope=taxAmountEnvelope*100;//reducing number of digits left of decimal to 2 for envelope sales tax
        taxAmountEnvelope=(int)taxAmountEnvelope;
        taxAmountEnvelope=taxAmountEnvelope/100.0;
        //Total cost of purchases(before tax)
        double preTaxTotalCost=preTaxSockTotal+preTaxGlassTotal+preTaxEnvelopeTotal;
        // total sales tax
        double totalTaxAmount=taxAmountSock+taxAmountGlass+taxAmountEnvelope;
        //Total Cost including sales tax
        double totalCost=preTaxTotalCost+totalTaxAmount;
        // print results out 
        System.out.println("Total number of pairs of socks purchased:"+nSocks);
        System.out.println("Cost per pair of socks:$"+sockCost);
        System.out.println("Total cost of socks(before tax):$"+preTaxSockTotal);
        System.out.println("Total Sales Tax for sock purchase:$"+taxAmountSock);
        System.out.println(" ");
        System.out.println("Total number of drinking glasses purchased:"+nGlasses);
        System.out.println("Cost per glass:$"+glassCost);
        System.out.println("Total cost of glasses(before tax):$"+preTaxGlassTotal);
        System.out.println("Total Sales Tax for glass purchase:$"+taxAmountGlass);
        System.out.println(" ");
        System.out.println("Total number of boxes of envelopes purchased:"+nEnvelopes);
        System.out.println("Cost per box of envelopes:$"+envelopeCost);
        System.out.println("Total cost of envelopes(before tax):$"+preTaxEnvelopeTotal);
        System.out.println("Total Sales Tax for envelope purchase:$"+taxAmountEnvelope);
        System.out.println(" ");
        System.out.println("Total Cost(before tax):$"+preTaxTotalCost);
        System.out.println("Total Sales Tax:$"+totalTaxAmount);
        System.out.println("Total Cost:$"+totalCost+"0");
    }//end of main method
}//end of class