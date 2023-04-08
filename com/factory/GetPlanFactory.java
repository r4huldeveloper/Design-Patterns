package com.factory;

 class GetPlanFactory {

    // USE getPlan() method to get object of type Plan
    public Plan getPlan(String planType){
        
        if(planType==null){
            return null;
        }

        if(planType.equalsIgnoreCase("DOMESTICPLAN")){
          return new DomesticPlan();
        }

        if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }

        if(planType.equalsIgnoreCase("INSTITUTEPLAN")){
            return new InstitutePlan();
        }


        return null;
    }

   
}
