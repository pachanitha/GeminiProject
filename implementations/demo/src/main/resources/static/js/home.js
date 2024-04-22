let sciencePlans = [];

function submitForm(event) {
  event.preventDefault();

  let form = document.getElementById("sciencePlanForm");
  let sciencePlan = {
    creator: form.creator.value,
    submitter: form.submitter.value,
    fundingInUSD: form.fundingInUSD.value,
    objectives: form.objectives.value,
    starSystem: form.starSystem.value,
    startDate: form.startDate.value,
    endDate: form.endDate.value,
    telescopeLocation: form.telescopeLocation.value,
    dataProcRequirements: form.dataProcRequirements.value,
  };

  sciencePlans.push(sciencePlan);
  displaySciencePlans();
  form.reset();
}

function displaySciencePlans() {
  let list = document.getElementById("sciencePlanList");
  list.innerHTML = "";
  for (let sciencePlan of sciencePlans) {
    let item = document.createElement("li");
    item.textContent = JSON.stringify(sciencePlan);
    list.appendChild(item);
  }
}
