package cucumber.examples.java.testNG.runners;

public class GenerateFeatureList {

	public static void main(String[] args) {
		//"src\\main\\resources\\features\\Desktop\\YPO_Catalog.feature","src\\main\\resources\\features\\Desktop\\YPO_CatalogDeleteItem.feature"

		String []arr={"ypo.feature","ypo1.feature"};
		String tempfeature="\"src\\main\\resources\\features\\Desktop\\temp\"";
		//String tempfeature="\"src\\main\\resources\\features\"";
    	String featuresList = tempfeature;
    	for (int i=0;i<arr.length;i++){
    		if(i==0){
    			featuresList=featuresList.replaceAll("temp",arr[i]);
    		}
    		else if (i!=0&&i<arr.length){
    			featuresList=featuresList+","+tempfeature.replaceAll("temp",arr[i]);
    		}
      	}
    	System.out.println(featuresList);
	}
}
