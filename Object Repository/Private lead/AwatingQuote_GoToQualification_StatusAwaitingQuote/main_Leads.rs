<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>main_Leads</name>
   <tag></tag>
   <elementGuidId>85b7fca0-8ae8-4971-9042-1efe78d25086</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>main</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>AjaxBody</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>app-layout__content mdl-layout__content no-bg-img</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
            






    
        
            
        
    
    
        Leads
    



    
        
            
                Private Leads 
                1
            
            
                Internet Leads 
                14
            
            
                Agent Leads 
                10
            
            
                Corporate Initiations 
                3
            
        
    

    
        
            
            Filters
        

        
            
                
                CLIENT NAME
                
                    search
                
            
        

        
            
        


        
            
        

        
            Status
        

        
            
                    
                        
                        Abandonned
                    
                    
                        
                        Awaiting quote
                    
                    
                        
                        Draft
                    
                    
                        
                        Not Handled
                    
                    
                        
                        Pending PMS
                    
                    
                        
                        Pending
                    
                    
                        
                        Transferred
                    
            
            
                Apply 
            
        

        
            Clearclose
        
    
    





     Create Lead



    
        
            IDClientIdCREATED CLIENT NAMECLIENT EMAILMOVE DATEDEPARTUREDESTINATIONALLOCATED TOALLOCATED TOSTATUS25374239385/10/2018 09:50Shiv RAJARAM shivraja@gmail.com18/10/2018BangladeshBenin
        
        
            Vincent RODRIGUEZ
John SMITH
Moris NASSEAU
Not Allocated

            Moris NASSEAU
        
        
    Moris NASSEAU
        
            Awaiting quote
        
    25200237674/10/2018 16:04Ashish TESTINGatest@arc.comAngolaAnguilla
        
        
            Vincent RODRIGUEZ
John SMITH
Moris NASSEAU
Not Allocated

            Moris NASSEAU
        
        
    Moris NASSEAU
        
            Awaiting quote
        
    25199237664/10/2018 16:01Aksh GOPALagopal@arc.comAfghanistanÅland Islands
        
        
            Vincent RODRIGUEZ
John SMITH
Moris NASSEAU
Not Allocated

            Moris NASSEAU
        
        
    Moris NASSEAU
        
            Awaiting quote
        
    24903234693/10/2018 15:13Shab JAUshabjau@gmail.com4/10/2018Åland IslandsAlbania
        
        
            Vincent RODRIGUEZ
John SMITH
Moris NASSEAU
Not Allocated

            Moris NASSEAU
        
        
    Moris NASSEAU
        
            Awaiting quote
        
    127411133324/9/2018 18:26shameemah RAIsham@astk.com26/9/2018AlbaniaAlbania
        
        
            Vincent RODRIGUEZ
John SMITH
Moris NASSEAU
Not Allocated

            Moris NASSEAU
        
        
    Moris NASSEAU
        
            Awaiting quote
        
    ...12345678...1 of 2 pages (7 items)FilterIDClientIdCREATEDCLIENT NAMECLIENT EMAILMOVE DATEDEPARTUREDESTINATIONALLOCATED TOALLOCATED TOSTATUS

            
                Rows:
                
            
        
    

$(function($){$(&quot;#PrivateLeadsGrid&quot;).ejGrid({&quot;locale&quot;:&quot;en-GB&quot;,&quot;allowPaging&quot;:true,&quot;allowSorting&quot;:true,&quot;selectedRowIndices&quot;:[],&quot;_checkedRowIndices&quot;:[],&quot;dataSource&quot;:ej.DataManager({&quot;url&quot;:&quot;/Leads/GetGridData?qid=6ED7CE004600AF71140512554056140A1A100E6B86339B1642200607455064D1DB531F19DA070A0000575F53000F0711&amp;status=Draft, NotHandled, Pending&amp;createDateRange=05/09/2018-05/10/2018&amp;moveDateRange=&amp;searchText=&amp;leadType=Private&quot;,&quot;cachingPageSize&quot;:0,&quot;enableAJAXCache&quot;:false,&quot;adaptor&quot;:&quot;UrlAdaptor&quot;,&quot;headers&quot;:[]}),&quot;cssClass&quot;:&quot;&quot;,&quot;isResponsive&quot;:true,&quot;enableResponsiveRow&quot;:true,&quot;columns&quot;:[{&quot;field&quot;:&quot;LeadId&quot;,&quot;headerText&quot;:&quot;ID&quot;,&quot;isPrimaryKey&quot;:true,&quot;visible&quot;:false,&quot;width&quot;:80,&quot;type&quot;:&quot;number&quot;},{&quot;field&quot;:&quot;ClientId&quot;,&quot;headerText&quot;:&quot;ClientId&quot;,&quot;visible&quot;:false,&quot;width&quot;:80},{&quot;field&quot;:&quot;FormattedCreationDate&quot;,&quot;headerText&quot;:&quot;CREATED&quot;,&quot;allowEditing&quot;:false,&quot;width&quot;:80,&quot;type&quot;:&quot;string&quot;},{&quot;field&quot;:&quot;ClientName&quot;,&quot;headerText&quot;:&quot;CLIENT NAME&quot;,&quot;allowEditing&quot;:false,&quot;width&quot;:80,&quot;type&quot;:&quot;string&quot;},{&quot;field&quot;:&quot;ClientEmail&quot;,&quot;headerText&quot;:&quot;CLIENT EMAIL&quot;,&quot;allowEditing&quot;:false,&quot;width&quot;:85,&quot;type&quot;:&quot;string&quot;},{&quot;field&quot;:&quot;FormattedMoveDate&quot;,&quot;headerText&quot;:&quot;MOVE DATE&quot;,&quot;allowEditing&quot;:false,&quot;width&quot;:80,&quot;type&quot;:&quot;string&quot;},{&quot;field&quot;:&quot;DepartureCountry&quot;,&quot;headerText&quot;:&quot;DEPARTURE&quot;,&quot;allowEditing&quot;:false,&quot;width&quot;:85,&quot;type&quot;:&quot;string&quot;},{&quot;field&quot;:&quot;DestinationCountry&quot;,&quot;headerText&quot;:&quot;DESTINATION&quot;,&quot;allowEditing&quot;:false,&quot;width&quot;:85,&quot;type&quot;:&quot;string&quot;},{&quot;field&quot;:&quot;AllocatedCoordinatorId&quot;,&quot;headerText&quot;:&quot;ALLOCATED TO&quot;,&quot;allowEditing&quot;:false,&quot;template&quot;:&quot;#coordinatorList&quot;,&quot;textAlign&quot;:&quot;center&quot;,&quot;width&quot;:90},{&quot;field&quot;:&quot;AllocatedTo&quot;,&quot;headerText&quot;:&quot;ALLOCATED TO&quot;,&quot;editType&quot;:&quot;dropdownedit&quot;,&quot;textAlign&quot;:&quot;center&quot;,&quot;visible&quot;:false,&quot;dataSource&quot;:ej.isJSON([{&quot;Value&quot;:&quot;Vincent RODRIGUEZ&quot;,&quot;Key&quot;:&quot;1&quot;,&quot;ObjectId&quot;:0},{&quot;Value&quot;:&quot;John SMITH&quot;,&quot;Key&quot;:&quot;2&quot;,&quot;ObjectId&quot;:0},{&quot;Value&quot;:&quot;Moris NASSEAU&quot;,&quot;Key&quot;:&quot;10&quot;,&quot;ObjectId&quot;:0},{&quot;Value&quot;:&quot;Not Allocated&quot;,&quot;Key&quot;:&quot;0&quot;,&quot;ObjectId&quot;:0}]),&quot;width&quot;:90,&quot;type&quot;:&quot;string&quot;},{&quot;field&quot;:&quot;LeadStatus&quot;,&quot;headerText&quot;:&quot;STATUS&quot;,&quot;allowEditing&quot;:false,&quot;template&quot;:&quot;#gridStatus&quot;,&quot;textAlign&quot;:&quot;center&quot;,&quot;width&quot;:85}],&quot;pageSettings&quot;:{&quot;pageSize&quot;:5},&quot;sortSettings&quot;:{&quot;sortedColumns&quot;:[{&quot;field&quot;:&quot;FormattedCreationDate&quot;,&quot;direction&quot;:&quot;descending&quot;}]},&quot;actionComplete&quot;:&quot;onLeadsGridActionCompleted&quot;,&quot;beginEdit&quot;:&quot;OnQueryCellInfo&quot;,&quot;recordClick&quot;:&quot;onPrivateGridRecordClick&quot;});$(&quot;#pageSize&quot;).ejDropDownList({&quot;dataSource&quot;:ej.isJSON([5,10,15,20,25]),&quot;selectedItemIndex&quot;:0,&quot;selectedIndex&quot;:0,&quot;width&quot;:&quot;100%&quot;,&quot;locale&quot;:&quot;en-GB&quot;,&quot;change&quot;:&quot;sizeValChange&quot;});});




        </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;AjaxBody&quot;)</value>
   </webElementProperties>
</WebElementEntity>
