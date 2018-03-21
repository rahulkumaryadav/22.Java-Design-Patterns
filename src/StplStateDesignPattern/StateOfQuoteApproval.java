package StplStateDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class StateOfQuoteApproval {

    public static void main(String[] args) {
        QuoteContext quoteContext=new QuoteContext();
        State quoted =new Quoted();
        State QuotationApprovedByHod=new QuotatonApprovedByHod();
        State fileUpload= new FileUpload();
        State requiredDocument= new RequiredDocuments();


        ArrayList<State> needHodApproval=new ArrayList();
        needHodApproval.add(quoted);
        needHodApproval.add(QuotationApprovedByHod);
        needHodApproval.add(fileUpload);
        needHodApproval.add(requiredDocument);

        ArrayList<State> withoutHodApproval=new ArrayList();
        withoutHodApproval.add(quoted);
        withoutHodApproval.add(fileUpload);
        withoutHodApproval.add(requiredDocument);


        Iterator itr=withoutHodApproval.iterator();
        while(itr.hasNext()){
            quoteContext.setState((State) itr.next());
            quoteContext.doAction();
        }

    }
}
